package string;

import java.util.Scanner;

public class ReverseString1 {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String to be reversed");
		String s1 = s.nextLine();
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}
		
	}
}