package arrays;

public class Repeat {
	
	public boolean word(String a[]) {
		int cnt =0;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				System.out.println(a[i]);
				System.out.println(a[j]);
			if(a[i].equals(a[j])) {
				cnt=cnt+1;
			}
		}
		}
		if(cnt==1) {
			flag=true;
		}
		return flag;
	}
	
	
	public static void main(String[] arg) {
		Repeat r=new Repeat();
		String[] a= {"Hello"};
		 boolean p= r.word(a);
		System.out.println(p);
	}

}
