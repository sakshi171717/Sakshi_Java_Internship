package exceptionhandling;

public class A {
	
	public static void main(String[] args) {
		int a[]= {10,20,30};
		try {
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
		}catch(Exception e) {
			System.out.println("Further data not available");      // handled array index out of bound exception
		}
		
		int b=10;
		int c=0;
		try {
			int d=b/c;
			System.out.println("Division= "+d);
		}catch(Exception e) {
			System.out.println("Can't Divided by 0");            // handled arithmatic exception
		}
		
		String s= "Sakshi";
		try {
		int i= Integer.parseInt(s);
		}catch(Exception e) {
			System.out.println("Can't convert String into integer");
		}
	}

}
