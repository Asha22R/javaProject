package sentance;

import java.util.Scanner;

public class SwapFisrtAndLastIndexWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to swap");
		String data = sc.nextLine();
		String[] sp = data.split(" ");
		String temp = sp[0];
		sp[0] = sp[sp.length - 1];
		sp[sp.length - 1] = temp;
		for (String ch : sp) {
			System.out.print(ch + " ");
		}
		sc.close();
	}
}
