package abstractionintro;

public abstract class ABC {
	
	public void m1() {
		System.out.println("Non-abstract method");
	}
	
	public abstract void m2(); 

}


/*Here the class ABC we made as abstract so that it can have the 
 * authority to access abstract methods.
 * 
 * Here m2 is an abstract method which can't have body because it
 * is declared as abstract
 * 
 * and m1 is non abstract method which can be implemented in abstract class
 * 
 * but abstract method can't be implemented in non abstract class.*/
 