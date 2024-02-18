package project_Jackpot_game;

	import java.util.Scanner;

	public class UserInfo {
		static Scanner sc = new Scanner(System.in);
		static UserOperations usop = new UserOperations();
		
		public static void getLogin() {
			System.out.println("Enter Username");
			String username = sc.next();
			System.out.println("Enter Password");
			String pass = sc.next();
			System.out.println("Check");
		    usop.login(username, pass);
		    
		}
		
		
		public static void signUp() {
			System.out.println("Enter Username");
			String username = sc.next();
			System.out.println("Enter Password");
			String pass = sc.next();
			Operation op = new Operation();
			op.setPassword(pass);
			op.setUserName(username);
			usop.addUser(op);
			
			UserLogSign.start();
		}
}
