package array;

import java.util.Arrays;

public class ShiftZerosleftAndDigitsInOrderOfInsertion {
	public static void main(String[] args) {
		int a[] = { 12, 23, 0, 43, 0, 21 };
		// output : {0,0,12,23,43,21}
		int[] b = new int[a.length];
		int j = a.length - 1;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] != 0) {
				b[j] = a[i];
				j--;
			} 
		}
		System.out.println(Arrays.toString(b));
	}
}
