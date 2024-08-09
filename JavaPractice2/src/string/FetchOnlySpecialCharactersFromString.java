package string;

public class FetchOnlySpecialCharactersFromString {
public static void main(String[] args) {
	String input = "c1a2&5df%";
	for (int i = 0; i < input.length(); i++) {
		if(input.charAt(i)>='A' && input.charAt(i)<='Z' ||input.charAt(i)>='a' &&input.charAt(i)<='z' ||input.charAt(i)>='0' && input.charAt(i)<='9') {
			
		}
		else {
			System.out.print(input.charAt(i));
		}
		}
}

}
