package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {
	
	public static void main(String[] args) {
	LinkedHashMap<String, Integer> map=new LinkedHashMap();
	map.put("a",1);
	map.put("b",2);
	map.put("c", 3);
	
	System.out.println(map);
	
	for (Map.Entry<String, Integer> obj: map.entrySet()) {
		System.out.println("Key: "+obj.getKey());
		System.out.println("Value: "+obj.getValue());
	}
	
	
	LinkedHashMap<Integer, String> map1=new LinkedHashMap();
	map1.put(1,"a");
	map1.put(2,"b");
	map1.put(3,"c");
	
	System.out.println(map);
	
	for (Map.Entry<Integer, String> obj: map1.entrySet()) {
		System.out.println("Key: "+obj.getKey());
		System.out.println("Value: "+obj.getValue());
	}
	}	

}
