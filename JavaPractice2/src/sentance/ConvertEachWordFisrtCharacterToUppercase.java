package sentance;

public class ConvertEachWordFisrtCharacterToUppercase {

	public static void main(String[] args) {
		String s = "my Name is asha";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			String s2 = s1[i];
			System.out.print(Character.toUpperCase(s2.charAt(0)) + s2.substring(1) + " ");
		}
	}
}
