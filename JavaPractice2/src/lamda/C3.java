package lamda;

public class C3 {
	public static void main(String[] args) {
		I3 i = (a, b) -> {
			return a + b;
		};
		System.out.println(i.add(3, 5));
	}
}
