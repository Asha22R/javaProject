package sentance;

public class PrintConsecutiveCountOfCharacters {
	public static void main(String[] args) {
		String s = "aaa";
		int count = 1;
		for (int i = 0; i <=s.length() - 2; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			}
			else {
				System.out.print("" + s.charAt(i) + count);
				count = 1;
			}
			if (i == s.length() - 2) {
				System.out.println("" + s.charAt(i) + count);
				count = 1;
			}
		}
	}
}
