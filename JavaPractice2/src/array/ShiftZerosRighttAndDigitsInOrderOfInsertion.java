package array;

import java.util.Arrays;

public class ShiftZerosRighttAndDigitsInOrderOfInsertion {
	public static void main(String[] args) {
		int a[] = { 12, 23, 0, 43, 0, 21 };
		// output : {0,0,12,23,43,21}
		int[] b = new int[a.length];
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i] != 0) {
				b[j] = a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
