package collection;

public class MethodOverriding {
public static void main(String[] args) {
	A a= new B();
	a.test();
	B a1=(B)a;
	a1.test();
}
}
class A{
	public void test() {
		System.out.println("A");
	}
}
class B extends A{
	public void test() {
	System.out.println("B");	
	}
}