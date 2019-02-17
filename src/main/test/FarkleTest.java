package main.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Farkle;

class FarkleTest {

	@Test
	void test() {
		// arrange
		int[] input = new int[] { 1 };
		Farkle farkle = new Farkle();
		
		// act
		int result = farkle.score(input);
		
		// assert
		Assertions.assertEquals(100, result);
	}
}
