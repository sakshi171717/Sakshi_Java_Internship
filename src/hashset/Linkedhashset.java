package hashset;

import java.util.LinkedHashSet;

public class Linkedhashset {
	
		public static void main(String[] arg) {
			LinkedHashSet<Integer> set= new LinkedHashSet<>();
			
			set.add(100);
			set.add(200);
			set.add(300);
			set.add(400);
			
			System.out.println(set);	// elements printed in order unlike to the hash set
			
			set.add(300);
			set.add(500);
			set.add(100);
			
			System.out.println(set);	//only new data inserted, repeated data i.e. duplicate values printed only once
			
		
		}

	


}
