package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Farkle {
	public int score(int[] input) {
		int numberOfDices = input.length;
		if (numberOfDices > 6)
			throw new IllegalArgumentException("Illegal number of dices: '" + numberOfDices + "'.");

		// The key is the eyes of the dice
		// The value is the number of the corresponding dice
		Map<Integer, Integer> sortedAndCountedDices = sortAndCountDices(input);
		return calculateScore(sortedAndCountedDices, numberOfDices);
	}

	private int accumulateSingleDices(Map<Integer, Integer> sortedDices) {
		Integer numberOfOnes = sortedDices.getOrDefault(1, 0);
		Integer numberOfFives = sortedDices.getOrDefault(5, 0);

		return numberOfOnes * 100 + numberOfFives * 50;
	}

	private Map<Integer, Integer> sortAndCountDices(int[] input) {
		Map<Integer, Integer> result = Arrays.stream(input).boxed()
				.collect(Collectors.groupingBy(Function.identity(), countNumberOfDices()));

		return result;
	}

	private Collector<Integer, ?, Integer> countNumberOfDices() {
		return Collectors.reducing(Integer.valueOf(0), (in, val) -> in + Integer.valueOf(1));
	}

	private int calculateScore(Map<Integer, Integer> sortedDices, int numberOfDices) {
		switch (numberOfDices) {
		case 3:
			return calculateThreeDices(sortedDices);
		case 4:
			return calculateFourDices(sortedDices);
		case 5:
			return calculateFiveDices(sortedDices);
		case 6:
			return calculateSixDices(sortedDices);
		default:
			return accumulateSingleDices(sortedDices);
		}
	}

	private int calculateThreeDices(Map<Integer, Integer> sortedDices) {
		if (sortedDices.containsValue(3)) {
			Integer eyes = getEyesOfDicesByCount(sortedDices, 3);
			return calculateValueOfTriple(eyes);
		}

		return accumulateSingleDices(sortedDices);
	}

	private int calculateFourDices(Map<Integer, Integer> sortedDices) {
		if (sortedDices.containsValue(4)) {
			Integer eyes = getEyesOfDicesByCount(sortedDices, 4);
			return calculateValueOfTriple(eyes) * 2;
		}

		if (sortedDices.containsValue(3)) {
			return calculateValueOfTripleAndRemaining(sortedDices);
		}

		return accumulateSingleDices(sortedDices);
	}

	private int calculateFiveDices(Map<Integer, Integer> sortedDices) {
		if (sortedDices.containsValue(5)) {
			Integer eyes = getEyesOfDicesByCount(sortedDices, 5);
			return calculateValueOfTriple(eyes) * 4;
		}

		if (sortedDices.containsValue(4)) {
			return calculateValueOfFourAndRemaining(sortedDices);
		}

		if (sortedDices.containsValue(3)) {
			return calculateValueOfTripleAndRemaining(sortedDices);
		}

		return accumulateSingleDices(sortedDices);
	}

	private int calculateValueOfFourAndRemaining(Map<Integer, Integer> sortedDices) {
		Integer eyes = getEyesOfDicesByCount(sortedDices, 4);
		Map<Integer, Integer> remainingDices = getRemainingEyes(sortedDices);
		return calculateValueOfTriple(eyes) * 2 + accumulateSingleDices(remainingDices);
	}

	private int calculateValueOfTripleAndRemaining(Map<Integer, Integer> sortedDices) {
		Integer eyes = getEyesOfDicesByCount(sortedDices, 3);
		Map<Integer, Integer> remainingDices = getRemainingEyes(sortedDices);
		return calculateValueOfTriple(eyes) + accumulateSingleDices(remainingDices);
	}

	private int calculateSixDices(Map<Integer, Integer> sortedDices) {
		if (sortedDices.containsValue(6)) {
			Integer eyes = getEyesOfDicesByCount(sortedDices, 6);
			return calculateValueOfTriple(eyes) * 8;
		}

		if (sortedDices.containsValue(5)) {
			Integer eyes = getEyesOfDicesByCount(sortedDices, 5);
			Map<Integer, Integer> remainingDices = getRemainingEyes(sortedDices);
			return calculateValueOfTriple(eyes) * 4 + accumulateSingleDices(remainingDices);
		}

		if (sortedDices.containsValue(4)) {
			return calculateValueOfFourAndRemaining(sortedDices);
		}

		if (sortedDices.containsValue(3)) {
			return calculateScoreOfSixDicesContainingTriple(sortedDices);
		}

		if (isThreePairs(sortedDices)) {
			return 800;
		}

		if (isStraight(sortedDices)) {
			return 1200;
		}

		return accumulateSingleDices(sortedDices);
	}

	private int calculateScoreOfSixDicesContainingTriple(Map<Integer, Integer> sortedDices) {
		if (sortedDices.size() == 2) {
			int result = 0;
			for (Entry<Integer, Integer> entry : sortedDices.entrySet()) {
				result += calculateValueOfTriple(entry.getKey());
			}
			return result;
		}

		return calculateValueOfTripleAndRemaining(sortedDices);
	}

	private int calculateValueOfTriple(int input) {
		switch (input) {
		case 1:
			return 1000;
		case 2:
			return 200;
		case 3:
			return 300;
		case 4:
			return 400;
		case 5:
			return 500;
		case 6:
			return 600;
		default:
			return 0;
		}
	}

	private boolean isStraight(Map<Integer, Integer> sortedDices) {
		return sortedDices.size() == 6;
	}

	private boolean isThreePairs(Map<Integer, Integer> sortedDices) {
		if (sortedDices.size() != 3)
			return false;

		for (Integer value : sortedDices.values()) {
			if (value != 2)
				return false;
		}

		return true;
	}

	private Integer getEyesOfDicesByCount(Map<Integer, Integer> sortedDices, int count) {
		for (Entry<Integer, Integer> entry : sortedDices.entrySet()) {
			if (entry.getValue() == count) {
				return entry.getKey();
			}
		}

		return 0;
	}

	private Map<Integer, Integer> getRemainingEyes(Map<Integer, Integer> sortedDices) {
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		for (Entry<Integer, Integer> entry : sortedDices.entrySet()) {
			if (entry.getValue() < 3) {
				result.put(entry.getKey(), entry.getValue());
			}
		}

		return result;
	}
}
