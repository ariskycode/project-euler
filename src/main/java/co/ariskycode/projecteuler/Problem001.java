package co.ariskycode.projecteuler;

/**
 * <h2>Problem 001 : Multiples of 3 and 5</h2><br/>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.<br/>
 * Likewise, find the sum of all the multiples of 3 or 5 below 1000.<br/><br/>
 *
 * Revised to calculate sum of all multiples of any two numbers up to n.
 *
 * @see <a href="https://projecteuler.net/problem=1">Project Euler 001</a>
 * @author ariskycode
 *
 */
public class Problem001 implements EulerSolution {

	private int x = 3;
	private int y = 5;
	private int n = 1000;

	@Override
	public String run() {
		return getProblemInfo() + String.format("Sum of all multiples of 3 and 5 upto 1000 is %s \n", solve());
	}

	@Override
	public String getProblemInfo() {
		StringBuffer buffer = new StringBuffer("Problem 001 : Multiples of 3 and 5\n");
		buffer.append("Find the sum of all the multiples of two numbers up to n.\n");
		return buffer.toString();
	}

	@Override
	public String solve() {
		return Double.toString(getSumOfMultiplesofXYuptoN(x, y, n));
	}

	protected double getSumOfMultiplesofXYuptoN(int x, int y, int n) {
		return (getSumOfMultiplesofKuptoN(x, n-1) + getSumOfMultiplesofKuptoN(y, n-1)) - getSumOfMultiplesofKuptoN(x*y, n-1);
	}

	protected double getSumOfMultiplesofKuptoN(int k, int n) {
		double multiples = Math.floor(n/k);
		return (k)*(multiples)*(multiples+1)*(0.5);
	}

	/**
	 * {@link Problem001}
	 */
	public Problem001() {
		super();
	}

	/**
	 * {@link Problem001}
	 */
	public Problem001(int x, int y, int n) {
		super();
		this.x = x;
		this.y = y;
		this.n = n;
	}

}
