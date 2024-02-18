package project_Jackpot_game;

import java.util.Scanner;

public class ScoreData {
	public static void scoredata() {
		System.out.println(".......................***************************.......................");
	while(true) {
		System.out.println("Press:\n1. View Information\n2. Play Game Again\n3. Logout");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) {
		case 1: Data.getData();
		break;
		case 2: Data.game();
		break;
		case 3: UserLogSign.start();
		break;
		}
	}

}
}
