package array;

public class largestUsingConditionalOp {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		String str = a < b ? a + "," + b : b + "," + a;
		System.out.println(str);
	}
}
