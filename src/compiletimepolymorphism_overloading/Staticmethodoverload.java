package compiletimepolymorphism_overloading;

public class Staticmethodoverload {
	public static void m1() {
		System.out.println("With no parameters");
	}
	
	public static void m1(int a) {
		System.out.println("With integer parameter");
	}
	
	public static void main(String[] arg) {
		Staticmethodoverload.m1();
		Staticmethodoverload.m1(20);
	}

}

/*Here static method m1 is overloaded because 
 * they have different parameters
 * so they can individually and seperately executed accordingly */
 