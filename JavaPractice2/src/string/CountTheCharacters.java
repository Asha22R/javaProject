package string;

import java.util.Scanner;

public class CountTheCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String which consists of combination of alphabets, numbers, special charcters");
		String input = sc.nextLine();
		int alphaUpCount = 0;
		int alphalowCount = 0;
		int numCount = 0;
		int speCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				alphaUpCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				alphalowCount++;
			} else if (ch >= '0' && ch <= '9') {
				numCount++;
			} else {
				speCount++;
			}

		}
		System.out.println("UpperAlphabets : " + alphaUpCount);
		System.out.println("LowererAlphabets : " + alphalowCount);
		System.out.println("NumberofDigits : " + numCount);
		System.out.println("NumberofSpe : " + speCount);
	}
}
