package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class LearningEntrySet {
public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	map.put("Sky", 63);
	map.put("Dhoni", 7);
	map.put("RS", 45);
	map.put("VK", 18);
	for (Entry<String, Integer> data : map.entrySet()) {
		System.out.print(data.getKey()+":"+data.getValue());
		System.out.println();
	}
}
}
