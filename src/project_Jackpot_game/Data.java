package project_Jackpot_game;
import java.util.Scanner;
public class Data {
	
	static Operation op=new Operation();
	static Scanner sc=new Scanner(System.in);
	String username;
	String password;
	int points;
	 
	
	
	public static void getData() {
		
		String s1= op.getUserName();
		String s2= op.getPassword();
		int s3= op.getPoints();
		
		System.out.println("Username : "+s1);
		System.out.println("Password: "+s2);
		System.out.println("Points: "+s3);
		
	}
	
	public static void game() {
		
		System.out.println("Enter points");
		int points = sc.nextInt();
		Operation op= new Operation();
		op.setPoints(points);
		if(points>=150) {
						op.minusPoints();
						System.out.println("Enter the Number: ");
						int usernum= sc.nextInt();
						op.setUserNum(usernum);
						int un= op.newPoints(usernum);
					if(un==1) {
								System.out.println("Winner !!!!\n");
								
							   }
					else {
						System.out.println("Looser...........\nBetter Luck Next Time !!!!\n");
					}
		}
			else {
					System.out.println("You Can't Continue due to less points");
				}

		int np= op.getPoints();
			System.out.println("After The Game, the moderated points of user is: "+np);
			System.out.println("\n");
	}
}
