package string;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateUsingHashset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String data= sc.nextLine();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < data.length(); i++) {
			set.add(data.charAt(i));
		}
		System.out.println(set);
	}

}
