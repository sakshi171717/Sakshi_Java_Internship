package vactor;
import java.util.Vector;
public class Example {
			public static void main(String[] arg) {
				Vector<Integer> v=new Vector<>();
				System.out.println("Capacity : "+v.capacity());
				
				v.addElement(100);
				v.addElement(200);
				v.addElement(300);
				
				System.out.println(v);
				System.out.println("Capacity : "+v.capacity());
				
				for(int i=0;i<21;i++) {
					v.addElement(i);			
				}
				
				System.out.println(v);
				System.out.println("Capacity : "+v.capacity());
				System.out.println("Size : "+v.size());					//capacity increases 2x hence even if size of vector is 24 it expands till 40 as--- 10-20-40-80-160.....----- in this range
				
				v.removeElement(18);
				v.remove(2);	//removes element at index 2 (index starts from 0 like array)
				v.elementAt(17);	//gives elements at index 17
				v.isEmpty();
				
				System.out.println(v);
			}

}
