package array;

import java.util.Arrays;

public class SummationOfArrayOneDimensional {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 5, 7,5,7};
		int[] c;
		if (a.length >= b.length) {
			c = new int[a.length];
			for (int i = 0; i < a.length; i++) {
				if (i != b.length) {
					c[i] = a[i] + b[i];
				} else {
					c[i] = b[b.length - 1];
				}
			}
		} else {
			c = new int[b.length];
			for (int i = 0; i < b.length; i++) {
				if (i != a.length) {
					c[i] = a[i] + b[i];
				} else {
					c[i] = a[a.length - 1];
				}
			}
		}

		System.out.println(Arrays.toString(c));
	}

}
