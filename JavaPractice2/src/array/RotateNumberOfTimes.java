package array;

import java.util.Arrays;

public class RotateNumberOfTimes {

	public static void main(String[] args) {
		String[] a = { "my", "name", "is", "asha" };
		int rotation = 2;
		for (int i = 0; i < rotation; i++) {
			String temp = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = temp;

		}
		System.out.println(Arrays.toString(a));

	}

}
