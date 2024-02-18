package exceptionhandling;

public class Sakshi extends RuntimeException{
	Sakshi(){					//we use default constructor here because parameterized constructor need to pass parameters and everytime the parameters are not same
		super("My Exception");
	}

}


