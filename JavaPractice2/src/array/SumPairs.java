package array;

import java.util.LinkedHashSet;

public class SumPairs {
	public static void main(String[] args) {
		int[] a = { 10, 3, 5, 8, 0, 13, 4, 5, 6, 2, 7, 2, 3, 11 };
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		int targetsum = 13;
		for (int i = 0; i < a.length ; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == targetsum) {
					String res = a[i] < a[j] ? (a[i] + "-" + a[j]) : (a[j] + "-" + a[i]);
					hs.add(res);
				}
			}
		}
		System.out.println(hs);
	}
}
