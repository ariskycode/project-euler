package co.ariskycode.projecteuler;

/**
 * <h2>Problem 006 : Sum square difference</h2><br/>
 *
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 *
 * @see <a href="https://projecteuler.net/problem=6">Project Euler 006</a>
 * @author ariskycode
 *
 */
public class Problem006 implements EulerSolution {

	private int n = 100;

	@Override
	public String run() {
		return getProblemInfo() + String.format("The difference between the sum of the squares of first %d numbers and the square of the sum is %s \n", n, solve());
	}

	@Override
	public String getProblemInfo() {
		StringBuffer buffer = new StringBuffer("Problem 006 : Sum Square Difference\n");
		buffer.append("Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.\n");
		return buffer.toString();
	}

	@Override
	public String solve() {
		return Integer.toString(Math.abs(getSumofSquares(n) - getSquareofSum(n)));
	}

	public int getSumofSquares(int n) {
		return (n * (n + 1) * ((2 * n) + 1)) / 6;
	}

	public int getSquareofSum(int n) {
		return (int) Math.pow(((n * (n + 1)) / 2), 2);
	}

	/**
	 * {@link Problem006}
	 */
	public Problem006() {
		super();
	}

	/**
	 * {@link Problem006}
	 */
	public Problem006(int n) {
		super();
		this.n = n;
	}

}
