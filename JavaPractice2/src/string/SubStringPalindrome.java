package string;

public class SubStringPalindrome {
	public static void main(String[] args) {
		String s = "java";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if (s.substring(i, j).length() >= 3) {
					palindrome(s.substring(i, j));
				}
			}
		}
	}

	public static void palindrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println(s + " String is a palindrome");
		}
	}
}
