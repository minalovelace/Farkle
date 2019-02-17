package main;

public class Farkle {
	public int score(int[] input) {
		if (input.length == 1) {
			if (input[0] == 1) {
				return 100;
			}
		}
		
		throw new IllegalStateException("Not able to calculate the actual score. Input was '" + input.toString() + "'.");
	}
}
