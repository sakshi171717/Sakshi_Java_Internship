package interfaceex;

public class Football extends Cricket {



public void getWorkout() {
	System.out.println("Running");
}

@Override
public void getSport() {
	System.out.println("Football");
}


}

/*here as football extends cricket hence the reamaining 
unimplimented methods that cricket holds of coach interface is 
implemented here*/










/*Here all the methods of coach as well as finance are have to 
implement because the class cricket implements coach and coach 
implemented finance*/