package co.ariskycode.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem017Test {

	private Problem017 p017 = new Problem017();

	@Test
	void testConvert_22242_ToLetters() {
		assertEquals("TwentyTwoThousandTwoHundredAndFortyTwo", p017.convertNumberToLetters(22242));
	}

	@Test
	void testConvert_10_ToLetters() {
		assertEquals("Ten", p017.convertNumberToLetters(10));
	}

	@Test
	void testConvert_10231451_ToLetters() {
		assertEquals("TenMillionThirtyOneThousandFourHundredAndFiftyOne", p017.convertNumberToLetters(10231451));
	}

	@Test
	void testConvert_321231451_ToLetters() {
		assertEquals("ThreeBillionOneMillionThirtyOneThousandFourHundredAndFiftyOne", p017.convertNumberToLetters(321231451));
	}

	@Test
	void testCalculateLettersIn_1_1() {
		assertEquals(3, p017.getNumberofLettersinN(1));
	}

	@Test
	void testCalculateLettersIn_1_5() {
		assertEquals(19, p017.getNumberofLettersinN(5));
	}

	@Test
	void testCalculateLettersIn_1_15() {
		assertEquals(74, p017.getNumberofLettersinN(15));
	}

	@Test
	void testCalculateLettersIn_1_1000() {
		assertEquals(21124, p017.getNumberofLettersinN(1000));
	}

}
