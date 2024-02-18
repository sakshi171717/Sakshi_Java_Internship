package encapsulationex2;

import java.util.Scanner;

public class Customer_operation {
	
	static Scanner sc= new Scanner(System.in);
	static Customer cm= new Customer();
	static App a= new App();
	
	
	public static void Billing() {
		System.out.println("Enter the Customer Id : ");
		int id= sc.nextInt();
		System.out.println("Enter the Cutomer Name : ");
		String name=sc.next();
		System.out.println("Enter the Quantity of the product : ");
		int quantityy= sc.nextInt();
		System.out.println("Enter the Amount : ");
		double custAmt= sc.nextInt();
		
		cm.setCust_id(id);
		cm.setCust_name(name);
		cm.setQuantity(quantityy);
		cm.setAmt_by_cust(custAmt);
		
	}


}
