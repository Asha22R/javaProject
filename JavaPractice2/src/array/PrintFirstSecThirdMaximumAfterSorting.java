package array;

import java.util.Scanner;

public class PrintFirstSecThirdMaximumAfterSorting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the array elements of size " + size);
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("The array elements are");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(a[a.length - 1] + " is the Maximum element in an array");
		System.out.println(a[a.length - 2] + " is the Second Maximum element in an array");
		System.out.println(a[a.length - 3] + " is the Third Maximum element in an array");
		s.close();
	}

}
