package sentance;

public class ReverseWordInSentenceInsamePlace {
public static void main(String[] args) {
	String s = "Mysore sandal Soap";
	String[] str = s.split(" ");
	for (int i = 0; i < str.length; i++) {
		String s1= str[i];
		for (int j = s1.length()-1; j>=0; j--) {
			System.out.print(s1.charAt(j));
		}
		System.out.print(" ");
	}
}
}
