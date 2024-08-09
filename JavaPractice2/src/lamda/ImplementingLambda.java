package lamda;

public class ImplementingLambda {
	public static void main(String[] args) {
		I1 ref = () -> System.out.println("Hello");
		ref.demo();
	}
}

