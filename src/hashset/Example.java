package hashset;

import java.util.HashSet;

public class Example {
	
	public static void main(String[] arg) {
		HashSet<Integer> set= new HashSet<>();
		
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		
		System.out.println(set);	// elements printed in random sequence bcoz they are stored as per hash values
		
		set.add(300);
		set.add(500);
		set.add(100);
		
		System.out.println(set);	//only new data inserted, repeated data i.e. duplicate values printed only once
		
		set.remove(200);
		set.contains(200);
	
	}

}
