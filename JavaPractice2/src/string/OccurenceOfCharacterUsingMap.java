package string;

import java.util.HashMap;
import java.util.Scanner;

public class OccurenceOfCharacterUsingMap {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = s.nextLine();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i)))
			{
				map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
			}
			else
			{
				map.put(s1.charAt(i), 1);
			}
		}
		System.out.println(map);
		s.close();
	}
}
