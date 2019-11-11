package co.ariskycode.projecteuler;

/**
 * <h2>Problem 017 : Number letter counts</h2><br/>
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out
 * in words, how many letters would be used?
 *
 * @see <a href="https://projecteuler.net/problem=17">Project Euler 017</a>
 * @author ariskycode
 *
 */
public class Problem017 implements EulerSolution {

	public static final String[] UNITS = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

	public static final String[] TENS = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

	private int n = 1000;

	@Override
	public String run() {
		return getProblemInfo() + String.format("Total number of letters in 1 - %d is %s \n", n, solve());
	}

	@Override
	public String getProblemInfo() {
		StringBuffer buffer = new StringBuffer("Problem 017 : Number letter counts\n");
		buffer.append("From 1 to 1000 inclusive were written out in words, how many letters would be used?\n");
		return buffer.toString();
	}

	@Override
	public String solve() {
		return Integer.toString(getNumberofLettersinN(n));
	}

	protected int getNumberofLettersinN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += convertNumberToLetters(i).length();
		}
		return sum;
	}

	protected String convertNumberToLetters(int number) {
		if (number < 20) {
			return UNITS[number];
		}
		if (number < 100) {
			return TENS[number / 10] + (((number % 10) != 0) ? "" : "") + UNITS[number % 10];
		}

		if (number < 1000) {
			return UNITS[number / 100] + "Hundred" + (((number % 100) != 0) ? "And" : "") + convertNumberToLetters(number % 100);
		}

		if (number < 1000000) {
			return convertNumberToLetters(number / 1000) + "Thousand" + (((number % 10000) != 0) ? "" : "") + convertNumberToLetters(number % 1000);
		}

		if (number < 100000000) {
			return convertNumberToLetters(number / 1000000) + "Million" + (((number % 1000000) != 0) ? "" : "") + convertNumberToLetters(number % 100000);
		}

		return convertNumberToLetters(number / 100000000) + "Billion" + (((number % 100000000) != 0) ? "" : "") + convertNumberToLetters(number % 10000000);
	}

}
