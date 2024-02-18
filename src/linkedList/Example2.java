package linkedList;

import java.util.ArrayList;
import java.util.Random;

public class Example2 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("TV");
		list.add("Mobile");
		list.add("Better luck next time");
		
		Random rm= new Random();
		int index = rm.nextInt(list.size());
		System.out.println(list.get(index));
	}
}
