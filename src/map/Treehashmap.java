package map;

import java.util.Map;
import java.util.TreeMap;

public class Treehashmap {
	
	public static void main(String[] arg) {
		TreeMap<String, Integer> map= new TreeMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		System.out.println(map);
		
		map.put("a", 1);
		map.put("b", 2);
		map.put("a", 5);
		//map.put(null, 5);			null key value not allowed
		System.out.println(map);	
		
		for(Map.Entry<String, Integer> obj: map.entrySet()) {
			System.out.println("Key= "+obj.getKey());
			System.out.println("Value= "+obj.getValue());
		}
	}


}
