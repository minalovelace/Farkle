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
		if (input.length > 6) {
			throw new IllegalArgumentException("Illegal number of dices: '" + input.length + "'.");
		}

		// The key is the eyes of the dice
		// The value is the number of the corresponding dice
		Map<Integer, Integer> sortedAndCountedDices = sortAndCountDices(input);
		return calculateScore(sortedAndCountedDices, input.length);
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
			return accumulateSingleDices(sortedDices);
		default:
			return accumulateSingleDices(sortedDices);
		}
	}

	private int calculateFiveDices(Map<Integer, Integer> sortedDices) {
		if (sortedDices.containsValue(5)) {
			Integer eyes = getEyesOfFirstDice(sortedDices);
			return calculateValueOfTriple(eyes) * 4;
		}

		if (sortedDices.containsValue(4)) {
			Integer eyes = getEyesOfFourDices(sortedDices);
			Map<Integer, Integer> remainingDices = getRemainingEyes(sortedDices);
			return calculateValueOfTriple(eyes) * 2 + accumulateSingleDices(remainingDices);
		}

		if (sortedDices.containsValue(3)) {
			Integer eyes = getEyesOfTriple(sortedDices);
			Map<Integer, Integer> remainingDices = getRemainingEyes(sortedDices);
			return calculateValueOfTriple(eyes) + accumulateSingleDices(remainingDices);
		}

		return accumulateSingleDices(sortedDices);
	}

	private Integer getEyesOfFourDices(Map<Integer, Integer> sortedDices) {
		for (Entry<Integer, Integer> entry : sortedDices.entrySet()) {
			if (entry.getValue() == 4) {
				return entry.getKey();
			}
		}

		return 0;
	}

	private int calculateFourDices(Map<Integer, Integer> sortedDices) {
		if (sortedDices.containsValue(4)) {
			Integer eyes = getEyesOfFirstDice(sortedDices);
			return calculateValueOfTriple(eyes) * 2;
		}

		if (sortedDices.containsValue(3)) {
			Integer eyes = getEyesOfTriple(sortedDices);
			Map<Integer, Integer> remainingDices = getRemainingEyes(sortedDices);
			return calculateValueOfTriple(eyes) + accumulateSingleDices(remainingDices);
		}

		return accumulateSingleDices(sortedDices);
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

	private Integer getEyesOfTriple(Map<Integer, Integer> sortedDices) {
		for (Entry<Integer, Integer> entry : sortedDices.entrySet()) {
			if (entry.getValue() == 3) {
				return entry.getKey();
			}
		}

		return 0;
	}

	private Integer getEyesOfFirstDice(Map<Integer, Integer> sortedDices) {
		return sortedDices.keySet().toArray(new Integer[0])[0];
	}

	private int calculateThreeDices(Map<Integer, Integer> sortedDices) {
		if (sortedDices.containsValue(3)) {
			Integer[] dices = sortedDices.keySet().toArray(new Integer[0]);
			return calculateValueOfTriple(dices[0]);
		}

		return accumulateSingleDices(sortedDices);
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
}
