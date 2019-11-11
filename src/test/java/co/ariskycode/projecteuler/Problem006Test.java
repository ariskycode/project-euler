package co.ariskycode.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem006Test {

	private Problem006 p006 = new Problem006();

	@Test
	void testGetSumofSquaresfor_1() {
		assertEquals(1, p006.getSumofSquares(1));
	}

	@Test
	void testGetSumofSquaresfor_10() {
		assertEquals(385, p006.getSumofSquares(10));
	}

	@Test
	void testGetSumofSquaresfor_100() {
		assertEquals(338350, p006.getSumofSquares(100));
	}

	@Test
	void testGetSquareofSumfor_1() {
		assertEquals(1, p006.getSquareofSum(1));
	}

	@Test
	void testGetSquareofSumfor_10() {
		assertEquals(3025, p006.getSquareofSum(10));
	}

	@Test
	void testGetSquareofSumfor_100() {
		assertEquals(25502500, p006.getSquareofSum(100));
	}

}
