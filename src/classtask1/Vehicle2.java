package classtask1;

import java.util.Scanner;

public class Vehicle2 {
	
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select for the Details of vehicle");
		System.out.println("1. for Car\n2. for Motorcycle");
		int ch= sc.nextInt();
		switch(ch) {
		case 1: Car c= new Car();
				c.info1();
		break;
		case 2: Motorcycle m=new Motorcycle();
				m.info1();
		break;
		default: System.out.println("Incorrect Choice");
		break;
		}
	} 
}
