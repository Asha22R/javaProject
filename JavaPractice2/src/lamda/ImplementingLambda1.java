package lamda;

public class ImplementingLambda1 {
	public static void main(String[] args) {
		I1 ref = () -> {
			System.out.println("hii");
			System.out.println("bujji");
			System.out.println("maa");
		};
		ref.demo();
	}
}