package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	String s = sc.nextLine();
	System.out.println(duplicate(s));	
	}
	public static List duplicate(String s) {
		List<Character> li = new ArrayList();
		for (int i = 0; i < s.length(); i++) {
			if(li.contains(s.charAt(i)))	{
		}
			else {
				li.add(s.charAt(i));
			}
	
	}
		return li;
	}}
