package arraylist;

import java.util.ArrayList;

public class Example {

		public static void main(String[] arg) {
			ArrayList list= new ArrayList();
			list.add(100);
			list.add(200);
			list.add(300);
			list.add(400);
			list.add(500);
			
			System.out.println(list);
			
			list.contains(200);
			System.out.println(list);
			
			list.remove(2);
			System.out.println(list);
			
			list.add("Sakshi");
			list.add(23.32);
			System.out.println(list);
		}

	

}
