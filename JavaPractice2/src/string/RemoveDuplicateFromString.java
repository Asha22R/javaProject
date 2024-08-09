package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a String");
		String data = sc.nextLine();
		HashMap<Character, Integer> map = new HashMap();
		for (int i = 0; i < data.length(); i++) {
			char c= data.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		System.out.println(map);
		System.out.print(map.keySet());
		for (Entry<Character, Integer> data1 : map.entrySet()) {
			System.out.print(data1.getKey());
		}
	}
}
