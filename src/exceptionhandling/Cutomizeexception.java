package exceptionhandling;

public class Cutomizeexception {
	public static void main(String[] arg) {
		try {
			throw new Sakshi();
		}catch(Sakshi s) {
			System.out.println("Exception handled");
		}
	}

}
