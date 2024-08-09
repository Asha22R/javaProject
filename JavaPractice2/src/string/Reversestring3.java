package string;

public class Reversestring3 {
public static void main(String[] args) {
	String s = "India";
	String rev = "";
	for (int i = 0; i < s.length(); i++) {
		rev=s.charAt(i)+rev;
	}
	System.out.println(rev);
}
}
