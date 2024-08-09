package array;

import java.util.Scanner;

public class Second_Maximum {

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
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				Sec_max = max;
				max = a[i];
			} else if (Sec_max < a[i]&&max!=a[i]) {
				Sec_max = a[i];
			}
		}
		System.out.println(Sec_max + " is the second largest element in an array");
		s.close();
	}

}
