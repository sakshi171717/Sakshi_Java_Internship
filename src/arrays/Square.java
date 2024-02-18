package arrays;

public class Square {
	public void aa(int a[]) {
		System.out.println("Square of an Array Elements:");
			for(int i=0;i<a.length;i++) {
				int c= a[i]*a[i];
				System.out.println(c);
			}
			
		}
	
	
	
	public static void main(String[] arg) {
		Square t=new Square();
		int a[]= {10,20,30,40,10};
		System.out.println("Original Array:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		t.aa(a);
	}

}
