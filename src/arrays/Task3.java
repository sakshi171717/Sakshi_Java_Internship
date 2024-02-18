package arrays;

public class Task3 {
	public void a(int b[]) {
		for(int i=0;i<b.length;i++) {
			if(b[i]==4) {
				b[i]=11;
			}
			System.out.println(b[i]);
		}
	}
	
	public static void main(String[] arg) {
		Task3 t=new Task3();
		int b[]= {1,2,3,4,5,4,6,7,4,8};
		t.a(b);
	}

}
