package project_Jackpot_game;

import java.util.ArrayList;

public class UserOperations {
	private ArrayList<Operation> arr;
	
	public UserOperations() {
		arr = new ArrayList<Operation>();
	}
	
	public void addUser(Operation us) {
		arr.add(us);
	}
	
	public void removeUser(Operation us) {
		arr.remove(us);
	}

	public void login(String userName, String pass) {
	    boolean found = false;
	    Operation op=new Operation();
	    for (Operation user : arr) {
	        String existingPassword = user.getPassword();
	        String existingUserName = user.getUserName();

	        if (existingPassword.equals(pass) && existingUserName.equals(userName)) {
	            System.out.println("Successfully logged in");
	            found = true;
	            while(found=true) {
		        	Data.game();
		        	break;
		        } 
	        }
	        if(!found) {
		    	System.out.println("Invalid Credentials");
		    }
	    }
	}

			
			
			
	
//	public void diaplayUsers() {
//		for(Operation us : arr) {
//			System.out.println("Username: "+us.getUserName()+" Password: "+us.getPassword()+" are set");
//			
//		}
//	}
	
	
	
}