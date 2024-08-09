package array;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = s.nextInt();
		int[] ar = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = s.nextInt();
		}
		System.out.println("Array elements are:");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println(" ");
		int firstLarge = ar[0];
		int secLarge = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > firstLarge) {
				secLarge = firstLarge;
				firstLarge = ar[i];
			} else if (ar[i] > secLarge && ar[i] != firstLarge) {
				secLarge = ar[i];
			}
		}
		System.out.println(secLarge);
		s.close();
	}
}
