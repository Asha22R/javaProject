package javaMock;

public class ReverseString1 {
public static void main(String[] args) {
	String s = "I love India";
	StringBuilder sb = new StringBuilder();
	for(int i= 0, j=s.length()-1;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			sb.append(" ");
		}
		else if(s.charAt(j)==' ') {
		i--;
		j--;
		}
		else {
			sb.append(s.charAt(j--));
		}
	}
	s= sb.toString();
	System.out.println(s);
	
}
}
