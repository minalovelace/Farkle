package main;

import java.util.Arrays;

public class Farkle {
	public int score(int[] input) {
		if (input.length < 3)
			return accumulateSingleDices(input);
		else if (input.length == 3)
			return calculateThreeDices(input);
		else if (input.length == 4) {
			int[] sortedInput = input;
			Arrays.sort(sortedInput, 0, sortedInput.length);
			return calculateFourDices(sortedInput);
		}

		// Farkle
		return 0;
	}

	private int calculateFourDices(int[] input) {
		int[] firstThreeDices = new int[] { input[0], input[1], input[2] };
		int[] lastThreeDices = new int[] { input[1], input[2], input[3] };
		if (isFourOfAKind(input)) {
			return calculateFourOfAKind(input[0]);
		} else if (isTriple(firstThreeDices)) {
			return calculateValueOfTriple(input[2]) + calculateSingleDice(input[3]);
		} else if (isTriple(lastThreeDices)) {
			return calculateValueOfTriple(input[2]) + calculateSingleDice(input[0]);
		}

		return 0;
	}

	private boolean isFourOfAKind(int[] input) {
		int[] firstThreeDices = new int[] { input[0], input[1], input[2] };
		return isTriple(firstThreeDices) && input[0] == input[3];
	}

	private int calculateFourOfAKind(int input) {
		return calculateValueOfTriple(input) * 2;
	}

	private int accumulateSingleDices(int[] input) {
		int result = 0;
		for (int i : input) {
			result += calculateSingleDice(i);
		}

		return result;
	}

	private int calculateThreeDices(int[] input) {
		if (isTriple(input)) {
			return calculateValueOfTriple(input[0]);
		}

		return accumulateSingleDices(input);
	}

	private boolean isTriple(int[] input) {
		return input[0] == input[1] && input[1] == input[2];
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

	private int calculateSingleDice(int input) {
		if (input == 1) {
			return 100;
		} else if (input == 5) {
			return 50;
		}

		return 0;
	}
}
