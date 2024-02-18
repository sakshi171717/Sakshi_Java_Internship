package stack;

import java.util.Stack;

public class Example {
	public static void main(String[] arg) {
		Stack st=new Stack();
		System.out.println("1. Capacity : "+st.capacity());
		
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(500);
		System.out.println(st);
		
		System.out.println("2. Capacity : "+st.capacity());
		st.push(600);
		System.out.println("3. Capacity : "+st.capacity());
		
		for(int i=1;i<21;i++) {
			st.push(i);
		}
		System.out.println(st);
		System.out.println("4. Capacity : "+st.capacity());
		
		st.pop();
		st.pop();
		System.out.println(st);
		
		st.peek();
		System.out.println(st);
	
	}

}
