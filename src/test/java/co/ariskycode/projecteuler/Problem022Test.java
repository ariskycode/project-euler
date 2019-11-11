package co.ariskycode.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem022Test {

	private Problem022 p022 = new Problem022();

	@Test
	void testCalculateNameScore() {
		String name = "COLIN";
		int index = 1;
		assertEquals(53, p022.calculateNameScore(name, index));
	}

	@Test
	void testCalculateNameScoreofList() {
		String[] names = { "ABCDE", "COLIN", "MARY" };
		assertEquals(292, p022.calculateNameScoreofList(names));
	}

}
