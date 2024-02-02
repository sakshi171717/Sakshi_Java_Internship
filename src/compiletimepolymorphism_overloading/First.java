package compiletimepolymorphism_overloading;

public class First {
	public void m1() {
		System.out.println("No Parameters");
	}
	
	public void m1(int a) {
		System.out.println("Integer parameter");
	}
	
	public void m1(String a) {
		System.out.println("String Parameter");
	}
	
	public static void main(String[] arg) {
		First f= new First();
		f.m1();
		f.m1(10);
		f.m1("Kbp");
	}

}

/*Here the method name is common here i.e. m1()
 * But the parameter it include are different
 * this is called compile time polymorphism because 
 * compiler matches the called method with its parameters at compile time
 * also the technique is called Method overloading
 * 
 *   in this, there is no need of inheritance compilsary
 *   but we can achieve it.*/
