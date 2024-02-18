package treeset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Example {
	
	public static void main(String[] arg) {
	TreeSet<Integer> ts= new TreeSet();
	ts.add(100);
	ts.add(200);
	ts.add(300);
	ts.add(400);
	ts.add(100);
	
	System.out.println(ts);
	
	TreeSet<String> ts1= new TreeSet();
	ts1.add("abc");
	ts1.add("def");
	ts1.add("uvw");
	ts1.add("xyz");
	
	System.out.println(ts1);
	
	HashSet<Integer> hs= new HashSet(ts);
	hs.add(100);
	hs.add(200);
	hs.add(300);
	hs.add(400);
	
	System.out.println(hs);
	
	TreeSet<Integer> ts2= new TreeSet(hs);
	ts2.add(100);
	ts2.add(200);
	ts2.add(300);
	ts2.add(400);
	
	System.out.print(ts2);
	
	LinkedHashSet<Integer> lhs= new LinkedHashSet(ts1);
	lhs.add(100);
	lhs.add(200);
	lhs.add(300);
	lhs.add(400);
	
	System.out.print(lhs);
	
	
	}
}
