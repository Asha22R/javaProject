package string;

public class SubstringPalindrome1 {
	public static void main(String[] args) {
		String s = "java";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String s1 = s.substring(i, j);
				if (s1.length() >= 3 && isPalindrome(s1)) {
					System.out.print(s.substring(i, j) + " ");
				}
			}

		}
	}

	public static boolean isPalindrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (rev.equalsIgnoreCase(s)) {
			return true;
		}
		return false;
	}
}
