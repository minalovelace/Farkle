package main.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Farkle;

class FarkleTest {

	// ---- Singles ----

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
	void testSingleDiceTwo() {
		// arrange
		int[] input = new int[] { 2 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(0, result);
	}

	@Test
	void testSingleDiceThree() {
		// arrange
		int[] input = new int[] { 3 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(0, result);
	}

	@Test
	void testSingleDiceFour() {
		// arrange
		int[] input = new int[] { 4 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(0, result);
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
	void testSingleDiceSix() {
		// arrange
		int[] input = new int[] { 6 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(0, result);
	}

	// ---- Doubles ----

	@Test
	void testDoubleOneAndOne() {
		// arrange
		int[] input = new int[] { 1, 1 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(200, result);
	}

	@Test
	void testDoubleOneAndTwo() {
		// arrange
		int[] input = new int[] { 1, 2 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(100, result);
	}

	@Test
	void testDoubleTwoAndTwo() {
		// arrange
		int[] input = new int[] { 2, 2 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(0, result);
	}

	@Test
	void testDoubleTwoAndOne() {
		// arrange
		int[] input = new int[] { 2, 1 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(100, result);
	}

	@Test
	void testDoubleTwoAndThree() {
		// arrange
		int[] input = new int[] { 2, 3 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(0, result);
	}

	@Test
	void testDoubleFiveAndOne() {
		// arrange
		int[] input = new int[] { 5, 1 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(150, result);
	}

	@Test
	void testDoubleFiveAndFive() {
		// arrange
		int[] input = new int[] { 5, 5 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(100, result);
	}

	// ---- Triples ----

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

	@Test
	void testTripleTwos() {
		// arrange
		int[] input = new int[] { 2, 2, 2 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(200, result);
	}

	@Test
	void testTripleThrees() {
		// arrange
		int[] input = new int[] { 3, 3, 3 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(300, result);
	}

	@Test
	void testTripleFours() {
		// arrange
		int[] input = new int[] { 4, 4, 4 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(400, result);
	}

	@Test
	void testTripleFives() {
		// arrange
		int[] input = new int[] { 5, 5, 5 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(500, result);
	}

	@Test
	void testTripleSixes() {
		// arrange
		int[] input = new int[] { 6, 6, 6 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(600, result);
	}
}
