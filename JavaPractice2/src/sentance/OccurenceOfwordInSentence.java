package sentance;

import java.util.HashMap;

public class OccurenceOfwordInSentence {
	public static void main(String[] args) {
		String s = "welcome to tp welcome to gc18";
		//Case1: output || welcome-2, to-2,tp-1,gc-18
		String[] s1 = s.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < s1.length; i++) {
			String c = s1[i];
			if(map.containsKey(c) ){
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		System.out.println(map);
	}

}
