package string;

import java.util.Scanner;

public class ReverseString {
	public ReverseString() {
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String to be reversed");
		String s1 = s.nextLine();
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		System.out.println(rev);
		
		ReverseString r = new ReverseString();
		System.out.println(r.test(s1));
		StringBuilder sb = new StringBuilder(s1);
		System.out.println(sb.reverse());
		s.close();	
	}

	public String test(String actData) {
		String rev = "";
		for (int i = actData.length() - 1; i >= 0; i--) {
			rev = rev + actData.charAt(i);
		}
		return rev;
	}
	public String test1(String actData) {
		String rev = "";
		for (int i = 0; i <actData.length(); i++) {
			rev = rev+actData.charAt(actData.length()-1-i);
		}
		return rev;
	}
	public String test2(String actData) {
		String rev = "";
		for (int i = 0; i <actData.length(); i++) {
			rev = rev+actData.charAt(actData.length()-1-i);
		}
		return rev;
	}
	public String test3(String actData) {
		String rev = "";
		for (int i = actData.length() - 1; i >= 0; i--) {
			rev = rev + actData.charAt(i);
		}
		return rev;
	}
}
