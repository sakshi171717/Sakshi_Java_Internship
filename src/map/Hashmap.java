package map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	
	public static void main(String[] arg) {
		HashMap<String, Integer> map= new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		System.out.println(map);
		
		map.put("a", 1);
		map.put("b", 2);
		map.put("a", 5);
		System.out.println(map);	
		
		for(Map.Entry<String, Integer> obj: map.entrySet()) {
			System.out.println("Key= "+obj.getKey());
			System.out.println("Value= "+obj.getValue());
		}
	}

}
