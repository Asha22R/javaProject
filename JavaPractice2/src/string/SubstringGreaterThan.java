package string;

public class SubstringGreaterThan {
	public static void main(String[] args) {
		String s = "java";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if (s.substring(i, j).length() >= 3) {
					System.out.println(s.substring(i, j));
				}
			}
		}
	}
}
