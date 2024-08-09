package string;

public class FetchOnlyALphabetsFromString {
public static void main(String[] args) {
	String input = "c1a2&5df%";
	for (int i = 0; i < input.length(); i++) {
		if(input.charAt(i)>='A' && input.charAt(i)<='Z' ||input.charAt(i)>='a' &&input.charAt(i)<='z') {
			System.out.print(input.charAt(i));
		}
		}
}

}
