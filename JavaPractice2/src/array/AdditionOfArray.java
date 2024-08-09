package array;

import java.util.Arrays;

public class AdditionOfArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 5, 7, 5, 7 };
		int size = Math.max(a.length, b.length);
		int[] c = new int[size];
		for (int i = 0; i < c.length; i++) {
			if (i < a.length) {
				c[i] += a[i];
			}
			if (i < b.length) {
				c[i] += b[i];
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
