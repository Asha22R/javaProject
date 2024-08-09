package string;

public class ReverseStringUsingRecursion1 {
	public static void main(String[] args) {
		String s = "Asha";
		reverse(s);
	}
public static char reverse(String s) {
	if(s.length()>0) {
		System.out.print(s.charAt(s.length()-1));
		return reverse(s.substring(0, s.length()-1));
	}
	else {
		return '\u0000';
	}
}
}
