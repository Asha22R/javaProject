package string;

import java.util.Scanner;

public class ReverseStringWithoutLength3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String to be reversed");
	String data = sc.nextLine();
	String op="";
	int i=0;
	while(true) {
		try {
			char ch= data.charAt(i);
			op=ch+op;
			i++;
			
		}catch (Exception e) {
			break;
		}
	}
	System.out.println(op);
}

}
