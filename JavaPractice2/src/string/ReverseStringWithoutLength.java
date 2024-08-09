package string;

import java.util.Scanner;

public class ReverseStringWithoutLength {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String to be reversed");
	String data = sc.nextLine();
	int j = findLength(data);
	System.out.println(reverse(data, j));
}
public static int findLength(String s) {
	char[] ch = s.toCharArray();
	int j=0;
	for (char c : ch) {
		j++;
	}
	return j;
}
public static String reverse(String s, int j) {
	String rev ="";
	for (int i = 0; i < j; i++) {
		rev= s.charAt(i)+rev;
	}
	return rev;
}
}
