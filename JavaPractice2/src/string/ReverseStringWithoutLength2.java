package string;

import java.util.Scanner;

public class ReverseStringWithoutLength2 {
	static String rev="";
public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a String to be reversed");
//	String data = sc.nextLine();
//	String op="";
//	for(char ch:data.toCharArray()) {
//		op=ch+op;
//	}
//	System.out.println(op);
	String s = "AMMA";
	reverse(s);
	if(rev==s) {
		System.out.println(s+" is a palindrome");
	}
	}

	public static void reverse(String s){
	if(s.length()-1>1){
	 rev= rev+s.charAt(s.length()-1);
	reverse(s.substring(0,s.length()-1));
	}
	}
}
