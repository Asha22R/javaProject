package lamda;

public class Perimeter {
	public static void main(String[] args) {
		Circle1 c = (r) -> {
			return 2 * 3.141 * r;
		};

		System.out.println(c.area(2));
	}

}
