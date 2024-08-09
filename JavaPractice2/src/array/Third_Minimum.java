package array;

import java.util.Scanner;

public class Third_Minimum {

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
		int min = Integer.MAX_VALUE;
		int Sec_min = Integer.MAX_VALUE;
		int third_min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				third_min = Sec_min;
				Sec_min = min;
				min = a[i];
			} else if (Sec_min > a[i] && min != a[i]) {
				Sec_min = a[i];
			} else if (third_min > a[i] && Sec_min != a[i] && min != a[i]) {
				third_min = a[i];
			}
		}
		System.out.println(third_min + " is the third minimum element in an array");
		s.close();
	}

}
