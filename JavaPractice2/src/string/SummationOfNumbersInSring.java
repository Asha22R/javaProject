package string;

import java.util.Scanner;

public class SummationOfNumbersInSring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String which consist of numbers");
		String input = sc.nextLine();
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int ch1 = Character.getNumericValue(input.charAt(i));
			if (ch >= '0' && ch <= '9') {
				sum += ch - 48;// Removing the ASCII value of '0' because we are fetching the character where
				sum1+=ch1;		// it will try to add the ASCII value but we don't want add ASCII value
				
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
	}
}
