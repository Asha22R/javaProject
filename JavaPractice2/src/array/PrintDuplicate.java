package array;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class PrintDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			int c = a[i];
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Entry<Integer, Integer> data : map.entrySet()) {
			if (data.getValue() > 1) {
				System.out.println(data.getKey());
			}
		}
		sc.close();
	}
}
