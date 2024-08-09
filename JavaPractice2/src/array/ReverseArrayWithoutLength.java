package array;

public class ReverseArrayWithoutLength {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6 };
		int count = 0;
		for (int n : ar) {
			count++;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}
		int[] ar1 = new int[count];
		for (int i = 0, j = count - 1; i < count && j >= 0; i++, j--) {
			ar1[j] = ar[i];
		}
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar1[i]);
		}
	}
}
