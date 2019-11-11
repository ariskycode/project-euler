package co.ariskycode.projecteuler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

/**
 * <h2>Problem 022 : Name Scores</h2><br/>
 * Using p022names.txt, begin by sorting it into alphabetical order. Then
 * working out the alphabetical value for each name, multiply this value by its
 * alphabetical position in the list to obtain a name score. For example, COLIN,
 * which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So,
 * COLIN would obtain a score of 938 × 53 = 49714. <br/>
 * What is the total of all the name scores in the file?
 *
 * @see <a href="https://projecteuler.net/problem=22">Project Euler 022</a>
 * @author ariskycode
 *
 */
public class Problem022 implements EulerSolution {

	private String[] getNamesfromFile() {
		try {
			String line = Files.readString(Path.of("src/main/resources/p022_names.txt"));
			line.replace("\"", "");
			return line.split(",");
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String run() {
		return getProblemInfo() + String.format("Total score of names in p022_names.txt is %s \n", solve());
	}

	@Override
	public String getProblemInfo() {
		StringBuffer buffer = new StringBuffer("Problem 022 : Name Scores\n");
		buffer.append("Find the total of all the name scores in the file p022_names.txt.\n");
		return buffer.toString();
	}

	@Override
	public String solve() {
		String[] names = getNamesfromFile();
		if (names == null) {
			return "0";
		}
		return calculateNameScoreofList(names);
	}

	protected String calculateNameScoreofList(String[] names) {
		int sum = 0;
		Arrays.sort(names);
		List<String> namesList = Arrays.asList(names);
		for (String name : namesList) {
			sum += calculateNameScore(name, namesList.indexOf(name) + 1);
		}
		return Integer.toString(sum);
	}

	protected int calculateNameScore(String name, int index) {
		int nameValue = 0;
		for (char letter : name.toCharArray()) {
			nameValue += letter - 64;
		}
		return nameValue * index;
	}

}
