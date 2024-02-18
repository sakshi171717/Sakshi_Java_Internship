package arrays;

public class SignChange {
	public void aa(int a[]) {
		System.out.println("Array after changing the signs:");
			for(int i=0;i<a.length;i++) {
				if(a[i]==-a[i]) {
					a[i]=a[i];
				}else {
					a[i]=-a[i];
				}
				System.out.println(a[i]);
			}
			
		}
	
	
	
	public static void main(String[] arg) {
		SignChange t=new SignChange();
		int a[]= {1,2,-3,4,-5,6,-7,-8};
		System.out.println("Array before changing the signs:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		t.aa(a);
	}

}
