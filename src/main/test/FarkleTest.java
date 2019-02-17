package main.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Farkle;

class FarkleTest {

	@Test
	void testSingleDiceOne() {
		// arrange
		int[] input = new int[] { 1 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(100, result);
	}

	@Test
	void testSingleDiceFive() {
		// arrange
		int[] input = new int[] { 5 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(50, result);
	}

	@Test
	void testTripleOnes() {
		// arrange
		int[] input = new int[] { 1, 1, 1 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(1000, result);
	}
}
