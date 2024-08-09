package sentance;

public class PrintConsecutiveCountOfCharacters2 {
	public static void main(String[] args) {
		String s = "aaac";
		int count = 1;
		int i;
		String word = "";
		for (i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				word = word + s.charAt(i) + count;
				count = 1;
			}
		}
		if (i == s.length() - 1) {
			word = word + s.charAt(i) + count;

		}
		System.out.println(word);
	}
}
