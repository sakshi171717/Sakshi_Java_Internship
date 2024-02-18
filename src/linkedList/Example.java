package linkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Example {

		public static void main(String[] arg) {
			LinkedList<Integer> list= new LinkedList<>();
			list.add(100);
			list.add(200);
			list.add(300);
			list.add(400);
			list.add(500);
			System.out.println(list);	//prints the data sequence wise
			
			Random ra=new Random();
			int index= ra.nextInt(list.size());    
			System.out.println(list.get(index));	//randomely picks the data and prints
			
			Random rm= new Random();
			Collections.shuffle(list,rm);
			System.out.println(list);
			
			Random rn= new Random();
			int otp= rn.nextInt(100000,999999);
			System.out.println(otp);
		}

	

}

