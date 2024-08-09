package string;

public class FetchOnlyNumbersFromString {
public static void main(String[] args) {
	String input = "c1a2&5df%";
	for (int i = 0; i < input.length(); i++) {
		if(input.charAt(i)>='0' && input.charAt(i)<='9' ) {
			System.out.print(input.charAt(i));
		}
		}
}

}
