package pattern;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows for the rhombus: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			// Print stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n; i >= 1; i--) {
			// Print stars
			for (int j = i - 1; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
