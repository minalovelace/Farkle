package main;

import java.util.Arrays;

public class Farkle {
	public int score(int[] input) {
		switch (input.length) {
		case 0:
		case 1:
		case 2:
			return accumulateSingleDices(input);
		case 3:
			return calculateThreeDices(input);
		case 4:
			return calculateFourDices(input);
		case 5:
			return calculateFiveDices(input);
		default:
			throw new IllegalArgumentException("Illegal number of dices: '" + input.length + "'.");
		}
	}

	private int calculateFiveDices(int[] input) {
		if (isFiveOfAKind(input))
			return calculateValueOfTriple(input[0]) * 4;

		return 0;
	}

	private boolean isFiveOfAKind(int[] input) {
		int[] firstFourDices = Arrays.copyOf(input, 4);
		return isFourOfAKind(firstFourDices) && input[0] == input[4];
	}

	private int[] sortDices(int[] input) {
		int[] sortedInput = input;
		Arrays.sort(sortedInput, 0, sortedInput.length);
		return sortedInput;
	}

	private int accumulateSingleDices(int[] input) {
		int result = 0;
		for (int i : input) {
			result += calculateSingleDice(i);
		}

		return result;
	}

	private int calculateFourDices(int[] input) {
		int[] sortedInput = sortDices(input);
		int[] firstThreeDices = Arrays.copyOf(input, 3);
		int[] lastThreeDices = Arrays.copyOfRange(input, 1, 4);
		if (isFourOfAKind(sortedInput))
			return calculateFourOfAKind(sortedInput[0]);
		else if (isTriple(firstThreeDices))
			return calculateValueOfTriple(sortedInput[2]) + calculateSingleDice(sortedInput[3]);
		else if (isTriple(lastThreeDices))
			return calculateValueOfTriple(sortedInput[2]) + calculateSingleDice(sortedInput[0]);

		return accumulateSingleDices(sortedInput);
	}

	private int calculateFourOfAKind(int input) {
		return calculateValueOfTriple(input) * 2;
	}

	private int calculateSingleDice(int input) {
		switch (input) {
		case 1:
			return 100;
		case 5:
			return 50;
		default:
			return 0;
		}
	}

	private int calculateThreeDices(int[] input) {
		if (isTriple(input)) {
			return calculateValueOfTriple(input[0]);
		}

		return accumulateSingleDices(input);
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

	private boolean isFourOfAKind(int[] input) {
		int[] firstThreeDices = Arrays.copyOf(input, 3);
		return isTriple(firstThreeDices) && input[0] == input[3];
	}

	private boolean isTriple(int[] input) {
		return input[0] == input[1] && input[1] == input[2];
	}
}
