package exceptionhandling;

public class Finally {
	
	public static void main(String[] args) {
		int ab= 10;
		int b= 0;
		try {
			int c= ab/b;
			System.out.println("Dividion done");		// as soon as exception occurs the control is forwarded to the catch and thid stmt not execute 
		}catch(ArrayIndexOutOfBoundsException w) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(ArithmeticException r) {
			System.out.println("ArithmeticException");
		}
		
		finally{
			System.out.println("Division done");	//to execute the further remaining stmt that doen't execute after encountering exception are kept in finally (Finally is executed compulsory in case of exception occure or doen't occure)
		}
	}

}
