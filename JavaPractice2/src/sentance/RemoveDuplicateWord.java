package sentance;

import java.util.HashSet;

public class RemoveDuplicateWord {
	public static void main(String[] args) {
		String s = "welcome to tp welcome to gc18";
		String[] s1 = s.split(" ");
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}
		System.out.println(set);
		}
}
