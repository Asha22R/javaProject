package lamda;

public class C2 {
	public static void main(String[] args) {
		I2 i = (a, b) -> {
			System.out.print(a + " + ");
			System.out.print(b + "= ");
			System.out.println(a + b);

		};
		i.add(3, 4);
		i.add(4, 5);
		I2 i1 = (a, b) -> {
			System.out.print(a + " * ");
			System.out.print(b + "=");
			System.out.println(a * b);

		};
		i1.add(3, 4);
	}

}
