package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PrintDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String actStr = sc.nextLine();
		HashMap<Character, Integer> map = new HashMap();
		for (int i = 0; i < actStr.length(); i++) {
			char ch = actStr.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
	
	for (Map.Entry<Character, Integer> data : map.entrySet()) {
		if(data.getValue()>1) {
			System.out.println(data.getKey());
		}
	}
}}
