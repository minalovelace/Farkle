package main;

public class Farkle {
	public int score(int[] input) {
		if (input.length == 1) {
			if (input[0] == 1) {
				return 100;
			} else if (input[0] == 5) {
				return 50;
			}
		}
		
		throw new IllegalStateException("Not able to calculate the actual score.");
	}
}
