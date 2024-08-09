package array;

import java.util.ArrayList;

public class BalancedAndUnBalanced {
	public static void main(String[] args) {
		String s = "{[()]}";
		ArrayList<Character> a = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (a.size() != 0 && (ch == ')' && a.get(a.size() - 1) == '(' 
					|| ch == '}' && a.get(a.size() - 1) == '{'
					|| ch == ']' && a.get(a.size() - 1) == '[')) 
			{
				a.remove(a.size() - 1);
			} else {
				a.add(ch);
			}
		}
		if (a.isEmpty()) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not balanced");
		}
	}
}
