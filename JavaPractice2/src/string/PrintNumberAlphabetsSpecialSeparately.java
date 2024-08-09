package string;

public class PrintNumberAlphabetsSpecialSeparately {
	public static void main(String[] args) {
		String input = "c1d$V2n@jd5$%";
		String alph = "";
		String num = "";
		String spe = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				num += input.charAt(i);
			} else if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'
					|| input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				alph += input.charAt(i);
			} else {
				spe += input.charAt(i);
			}
		}
		System.out.println(alph + " " + num + " " + spe);
	}
}
