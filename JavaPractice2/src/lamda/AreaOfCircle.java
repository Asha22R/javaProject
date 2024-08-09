package lamda;

public class AreaOfCircle {
	public static void main(String[] args) {
		Circle1 c = (r) -> {
			return 3.141 * r * r;
		};
		System.out.println(c.area(2));
	}
}
