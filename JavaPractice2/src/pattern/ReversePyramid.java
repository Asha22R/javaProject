package pattern;

public class ReversePyramid {
	public static void main(String[] args) {
		int n = 3;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j <= 4) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
