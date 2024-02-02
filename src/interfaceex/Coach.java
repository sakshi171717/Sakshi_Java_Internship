package interfaceex;

import interfaceex1.Finance;

public interface Coach extends Finance {
	
	public void getWorkout();
	public void getSport();

}


//Here coach and finance both are interfaces so extend keyword is used
//Coach have both its own and finance's methods 
//coach and finance are interfaces so by default they contain abstract i.e. unimplemented methods