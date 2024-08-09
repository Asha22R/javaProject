package lamda;

public class C1 implements I1 {
public void demo() {
	System.out.println("Hiii");
	
}
public static void main(String[] args) {
	I1 ref = new C1();
	ref.demo();
}
}
