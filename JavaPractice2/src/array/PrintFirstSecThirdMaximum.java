package array;

import java.util.Scanner;

public class PrintFirstSecThirdMaximum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int max = Integer.MIN_VALUE;
		int Sec_max = Integer.MIN_VALUE;
		int third_max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				third_max = Sec_max;
				Sec_max = max;
				max = a[i];
			} else if (Sec_max < a[i] && max != a[i]) {
				Sec_max = a[i];
			} else if (third_max < a[i] && Sec_max != a[i] && max != a[i]) {
				third_max = a[i];
			}
		}
		System.out.println(max + " is the First largest element in an array");
		System.out.println(Sec_max + " is the second largest element in an array");
		System.out.println(third_max + " is the third largest element in an array");
		s.close();
	}

}
