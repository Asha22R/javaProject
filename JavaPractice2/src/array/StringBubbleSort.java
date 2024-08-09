package array;

import java.util.Arrays;

public class StringBubbleSort {

	public static void main(String[] args) {
		String s = "my name is asha";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length - 1; i++) {
			for (int j = 0; j < s1.length - 1 - i; j++) {
				if (s1[j].compareTo(s1[j + 1]) > 0) {
					String temp = s1[j];
					s1[j] = s1[j + 1];
					s1[j + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(s1));

	}

}
