package string;

public class ReversestringUsingRecursion {
public static void main(String[] args) {
	String s = "India";
	String reverse = reverse(s);
	System.out.println(reverse);
}
public static String reverse(String s) {
	if (s.isEmpty()||s.length()==1) {
		return s;
	}
	return reverse(s.substring(1))+s.charAt(0);
}
}
