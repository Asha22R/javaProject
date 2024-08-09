package array;

public class LengthOfArrayWithoutLengthVariable {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6 };
		int count = 0;
		for (int n : ar) {
			count++;
		}
		System.out.println(count);
	}

}
