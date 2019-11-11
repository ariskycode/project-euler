package co.ariskycode.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.ariskycode.projecteuler.Problem001;

class Problem001Test {
	
	@Test
	void testWith3and5upto10() {
		assertEquals("23.0", new Problem001(3, 5, 10).solve());
	}
	
	@Test
	void testWith3and5upto1000() {
		assertEquals("233168.0", new Problem001().solve());
	}

	@Test
	void testWith13and15upto10000() {
		assertEquals("6921940.0", new Problem001(13, 15, 10000).solve());
	}
	
}
