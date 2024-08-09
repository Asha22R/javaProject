package string;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "Looh";
		String s2 = "Pool";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		boolean flag = true;
		if (s1.length() != s2.length()) {
			flag = false;
			System.out.println("Given strings are not Anagram");
			return;
		} else {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					flag = false;
					System.out.println("It is not a anagram");
					break;
				}
			}
		}
		if (flag==true) {
			System.out.println("Given strings are anagram");
		}
	}
}
