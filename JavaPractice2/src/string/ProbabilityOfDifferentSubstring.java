package string;

public class ProbabilityOfDifferentSubstring {
	public static void main(String[] args) {
		String s = "java";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.print(s.substring(i, j) + " ");
			}
		}
	}
}
