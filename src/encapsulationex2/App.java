package encapsulationex2;

import java.util.Scanner;

public class App {
	public static void main(String[] arg) {
		
		Home h=new Home();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println("Press 1 for Add product\n");
		System.out.println("Press 2 for See product\n");
		System.out.println("Press 3 for Update\n");
		int ch= sc.nextInt();
		
			switch(ch) {
			case 1: h.setData();
			break;
			
			case 2: h.getData();
			break;
			
			case 3: h.update();
			break;
			}
		}
		
	}
}
