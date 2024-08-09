package javaMock;

public class ReverseString {
	public static void main(String[] args) {
		String s = "I am String";
		String st = s.replace(" ", "");
		System.out.println(st);
		int j = st.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				System.out.print(st.charAt(j));
				j--;
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
