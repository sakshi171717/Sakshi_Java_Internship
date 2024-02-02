package pkgaccessspecifiers1;

public class Y {
	 
	public void getData() {
		X x=new X();
		System.out.println("Public "+x.pb);
		//System.out.println("Private "+x.pr);
		System.out.println("Protected "+x.pt);
		System.out.println("Default "+x.df);
		
		
	}
}
/*when we call the variable of another class having same package
 *public dafault and protected data are accessed but private data
 *is not, because it is very limited for that perticular class */
 