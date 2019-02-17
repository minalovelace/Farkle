package main;

public class Farkle {
	public int score(int[] input) {
		if (input.length == 1) {
			return CalculateSingleDice(input[0]);
		}

		if (input.length == 3) {
			return CalculateThreeDices(input);
		}

		// Farkle
		return 0;
	}

	private int CalculateThreeDices(int[] input) {
		if (input[0] == input[1] && input[1] == input[2]) {
			return calculateValueOfTriple(input[0]);
		}

		return 0;
	}

	private int calculateValueOfTriple(int input) {
		switch (input) {
		case 1:
			return 1000;
		case 2:
			return 200;
		default:
			return 0;
		}
	}

	private int CalculateSingleDice(int input) {
		if (input == 1) {
			return 100;
		} else if (input == 5) {
			return 50;
		}

		return 0;
	}
}
