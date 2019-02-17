package main;

public class Farkle {
	public int score(int[] input) {
		if (input.length == 1) {
			return CalculateSingleDice(input);
		}

		if (input.length == 3) {
			return CalculateThreeDices(input);
		}

		// Farkle
		return 0;
	}

	private int CalculateThreeDices(int[] input) {
		if (input[0] == input[1] && input[1] == input[2]) {
			switch (input[0]) {
			case 1:
				return 1000;
			default:
				return 0;
			}
		}

		return 0;
	}

	private int CalculateSingleDice(int[] input) {
		if (input[0] == 1) {
			return 100;
		} else if (input[0] == 5) {
			return 50;
		}

		return 0;
	}
}
