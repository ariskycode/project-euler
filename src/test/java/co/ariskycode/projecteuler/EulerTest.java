package co.ariskycode.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test class for all solutions
 *
 * @author ariskycode
 *
 */
class EulerTest {

	@Test
	void testSolutions() {
		assertEquals("233168.0", 	new Problem001().solve());
		assertEquals("25164150", 	new Problem006().solve());
		assertEquals("21124", 		new Problem017().solve());
		assertEquals("71346322", 	new Problem022().solve());
	}

}
