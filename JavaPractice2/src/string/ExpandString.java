package string;

public class ExpandString {
	public static void main(String[] args) {
		String s1 = "a2b2c3d3";
		for (int i = 0; i < s1.length() - 1; i = i + 2) {
			char ch = s1.charAt(i);
			int count = s1.charAt(i + 1) - 48;
			for (int j = 0; j < count; j++) {
				System.out.print(ch);
			}
		}
	}
}
