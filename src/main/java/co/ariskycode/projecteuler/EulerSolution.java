package co.ariskycode.projecteuler;

/**
 * Common interface for all Euler Problem solutions
 * 
 * @author ariskycode
 *
 */
public interface EulerSolution {
	
	/**
	 * Runs the solution, check console for output
	 */
	public String run();

	/**
	 * @return Description of the problem
	 */
	public String getProblemInfo();

	/**
	 * Solve method to solve the Euler problem for predefined inputs
	 */
	public String solve();
	
}
