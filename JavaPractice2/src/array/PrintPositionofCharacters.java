package array;

public class PrintPositionofCharacters {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 1, 3, 2, 5, 2 };

		for (int i = 0; i < a.length; i++) {
			String s = a[i] + " - ";
			boolean flag = true;
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (j < i) {
						flag = false;
						break;
					} else if (i != j) {
						s = s + j + ",";
						count++;
					}
				}

			}
			if (flag && count > 0) {
				System.out.println(s);
			}
		}
	}

}
