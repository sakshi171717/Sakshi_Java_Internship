package project_Jackpot_game;

import java.util.Scanner;

public class UserLogSign {
	static Scanner sc= new Scanner(System.in);
	public static void start() {
		System.out.println("Press:\n1.Login\n2.Sign in");
		Operation op=new Operation();
		switch(sc.nextInt()) {
		case 1:  UserInfo.getLogin();
			break;
		case 2:
			UserInfo.signUp();
			break;
		}
	}
}

