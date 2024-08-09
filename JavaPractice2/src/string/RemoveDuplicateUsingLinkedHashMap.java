package string;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class RemoveDuplicateUsingLinkedHashMap {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a String");
		String data = sc.nextLine();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < data.length(); i++) {
			char c= data.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		for (Entry<Character, Integer> data1 : map.entrySet()) {
			System.out.print(data1.getKey());
		}
	}
}
