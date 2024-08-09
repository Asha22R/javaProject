package pattern;

import java.util.Scanner;

public class EquilateralTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows for the rhombus: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			// Print stars
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scanner.close();

	}
}
