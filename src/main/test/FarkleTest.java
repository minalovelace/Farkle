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

	@Test
	void testTripleOneAndTwoAndThree() {
		// arrange
		int[] input = new int[] { 1, 2, 3 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(100, result);
	}

	@Test
	void testTripleThreeAndFourAndFive() {
		// arrange
		int[] input = new int[] { 3, 4, 5 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(50, result);
	}

	@Test
	void testTripleOneAndOneAndFive() {
		// arrange
		int[] input = new int[] { 1, 1, 5 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(250, result);
	}

	@Test
	void testTripleOneAndFiveAndFive() {
		// arrange
		int[] input = new int[] { 3, 4, 5 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(50, result);
	}

	@Test
	void testTripleTwoAndThreeAndFour() {
		// arrange
		int[] input = new int[] { 2, 3, 4 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(0, result);
	}

	@Test
	void testTripleFourAndTwoAndThree() {
		// arrange
		int[] input = new int[] { 4, 2, 3 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(0, result);
	}

	// ---- Four Dices ----

	@Test
	void testFourOfAKindOnes() {
		// arrange
		int[] input = new int[] { 1, 1, 1, 1 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(2000, result);
	}

	@Test
	void testFourOfAKindTwos() {
		// arrange
		int[] input = new int[] { 2, 2, 2, 2 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(400, result);
	}

	@Test
	void testFourOfAKindThrees() {
		// arrange
		int[] input = new int[] { 3, 3, 3, 3 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(600, result);
	}

	@Test
	void testFourOfAKindFours() {
		// arrange
		int[] input = new int[] { 4, 4, 4, 4 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(800, result);
	}

	@Test
	void testFourOfAKindFives() {
		// arrange
		int[] input = new int[] { 5, 5, 5, 5 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(1000, result);
	}

	@Test
	void testFourOfAKindSixes() {
		// arrange
		int[] input = new int[] { 6, 6, 6, 6 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(1200, result);
	}

	@Test
	void testTripleSixesAndOne() {
		// arrange
		int[] input = new int[] { 6, 6, 1, 6 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(700, result);
	}

	@Test
	void testTripleSixesAndFive() {
		// arrange
		int[] input = new int[] { 6, 5, 6, 6 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(650, result);
	}

	@Test
	void testTripleSixesAndFour() {
		// arrange
		int[] input = new int[] { 4, 6, 6, 6 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(600, result);
	}

	@Test
	void testTripleOneAndFive() {
		// arrange
		int[] input = new int[] { 5, 1, 1, 1 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(1050, result);
	}

	@Test
	void testTripleThreeAndFive() {
		// arrange
		int[] input = new int[] { 3, 5, 3, 3 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(350, result);
	}

	@Test
	void testTripleThreeAndOne() {
		// arrange
		int[] input = new int[] { 3, 3, 1, 3 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(400, result);
	}

	@Test
	void testFourDicesThreeAndOneAndFourAndFive() {
		// arrange
		int[] input = new int[] { 3, 1, 4, 5 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(150, result);
	}

	// ---- Five dices ----

	@Test
	void testFiveOfAKindOnes() {
		// arrange
		int[] input = new int[] { 1, 1, 1, 1, 1 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(4000, result);
	}

	@Test
	void testFiveOfAKindTwos() {
		// arrange
		int[] input = new int[] { 2, 2, 2, 2, 2 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(800, result);
	}

	@Test
	void testFiveOfAKindThrees() {
		// arrange
		int[] input = new int[] { 3, 3, 3, 3, 3 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(1200, result);
	}

	@Test
	void testFiveOfAKindFours() {
		// arrange
		int[] input = new int[] { 4, 4, 4, 4, 4 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(1600, result);
	}

	@Test
	void testFiveOfAKindFives() {
		// arrange
		int[] input = new int[] { 5, 5, 5, 5, 5 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(2000, result);
	}

	@Test
	void testFiveOfAKindSixes() {
		// arrange
		int[] input = new int[] { 6, 6, 6, 6, 6 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(2400, result);
	}

	@Test
	void testFourOfAKindSixesAndOne() {
		// arrange
		int[] input = new int[] { 6, 1, 6, 6, 6 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(1300, result);
	}

	@Test
	void testFourOfAKindFivesAndOne() {
		// arrange
		int[] input = new int[] { 5, 5, 1, 5, 5 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(1100, result);
	}

	@Test
	void testFourOfAKindOnesAndThree() {
		// arrange
		int[] input = new int[] { 1, 1, 1, 3, 1 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(2000, result);
	}

	@Test
	void testFourOfAKindTwosAndThree() {
		// arrange
		int[] input = new int[] { 2, 2, 2, 2, 3 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(400, result);
	}

	@Test
	void testThreeOfAKindTwosAndThreeAndFour() {
		// arrange
		int[] input = new int[] { 2, 2, 4, 2, 3 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(200, result);
	}

	@Test
	void testThreeOfAKindOnesAndSixAndSix() {
		// arrange
		int[] input = new int[] { 6, 1, 6, 1, 1 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(1000, result);
	}

	@Test
	void testThreeOfAKindOnesAndFiveAndFive() {
		// arrange
		int[] input = new int[] { 5, 5, 1, 1, 1 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(1100, result);
	}

	@Test
	void testFiveDifferentDicesContainingOne() {
		// arrange
		int[] input = new int[] { 1, 2, 3, 4, 6 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(100, result);
	}

	@Test
	void testFiveDifferentDicesContainingOneAndFive() {
		// arrange
		int[] input = new int[] { 2, 1, 3, 5, 4 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(150, result);
	}

	@Test
	void testFiveDifferentDicesContainingTwoOnesAndFive() {
		// arrange
		int[] input = new int[] { 2, 1, 3, 5, 1 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(250, result);
	}

	@Test
	void testFiveDifferentDicesFarkle() {
		// arrange
		int[] input = new int[] { 2, 2, 3, 6, 4 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(0, result);
	}

	// ---- Six dices ----

	@Test
	void testSixOfAKindOnes() {
		// arrange
		int[] input = new int[] { 1, 1, 1, 1, 1, 1 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(8000, result);
	}

	@Test
	void testSixOfAKindTwos() {
		// arrange
		int[] input = new int[] { 2, 2, 2, 2, 2, 2 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(1600, result);
	}

	@Test
	void testSixOfAKindThrees() {
		// arrange
		int[] input = new int[] { 3, 3, 3, 3, 3, 3 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(2400, result);
	}

	@Test
	void testSixOfAKindFours() {
		// arrange
		int[] input = new int[] { 4, 4, 4, 4, 4, 4 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(3200, result);
	}

	@Test
	void testSixOfAKindFives() {
		// arrange
		int[] input = new int[] { 5, 5, 5, 5, 5, 5 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(4000, result);
	}

	@Test
	void testSixOfAKindSixes() {
		// arrange
		int[] input = new int[] { 6, 6, 6, 6, 6, 6 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(4800, result);
	}

	@Test
	void testFiveOfAKindSixesAndOne() {
		// arrange
		int[] input = new int[] { 6, 6, 1, 6, 6, 6 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(2500, result);
	}

	@Test
	void testFiveOfAKindSixesAndTwo() {
		// arrange
		int[] input = new int[] { 6, 2, 6, 6, 6, 6 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(2400, result);
	}

	@Test
	void testFiveOfAKindOnesAndFive() {
		// arrange
		int[] input = new int[] { 1, 1, 1, 1, 5, 1 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(4050, result);
	}

	@Test
	void testFourOfAKindTwosAndFiveAndOne() {
		// arrange
		int[] input = new int[] { 2, 5, 2, 1, 2, 2 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(550, result);
	}

	@Test
	void testFourOfAKindThreesAndTwoAndSix() {
		// arrange
		int[] input = new int[] { 3, 6, 2, 3, 3, 3 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(600, result);
	}

	@Test
	void testThreeOfAKindThreesAndOneAndFiveAndFive() {
		// arrange
		int[] input = new int[] { 1, 3, 3, 5, 3, 5 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(500, result);
	}

	@Test
	void testThreeOfAKindThreesAndThreeOfAKindFives() {
		// arrange
		int[] input = new int[] { 3, 5, 3, 5, 3, 5 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(800, result);
	}

	@Test
	void testThreePairs() {
		// arrange
		int[] input = new int[] { 3, 5, 2, 2, 3, 5 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(800, result);
	}

	@Test
	void testStraight() {
		// arrange
		int[] input = new int[] { 1, 2, 3, 4, 5, 6 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(1200, result);
	}

	@Test
	void testUnsortedStraight() {
		// arrange
		int[] input = new int[] { 1, 3, 5, 6, 2, 4 };
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(1200, result);
	}

	// ---- Illegal number of dices ----

	@Test
	void testZeroDices() {
		// arrange
		int[] input = new int[] {};
		Farkle farkle = new Farkle();

		// act
		int result = farkle.score(input);

		// assert
		Assertions.assertEquals(0, result);
	}

	@Test
	void testSevenDices() {
		// arrange
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 1 };
		Farkle farkle = new Farkle();

		// act and assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			farkle.score(input);
		});
	}
}
