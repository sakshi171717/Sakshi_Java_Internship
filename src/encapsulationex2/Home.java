package encapsulationex2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import arraylist.Product;

public class Home {
	
	private static ArrayList<Appliances> list;
	
	public Home() {
		this.list=new ArrayList<>();
	}
	
		private static final double price = 0;
		static Scanner sc=new Scanner(System.in);
		static Appliances ap= new Appliances();
		Customer_operation cop= new Customer_operation();

		public static void setData() {
			System.out.println("Enter Product Id: ");
			int ch= sc.nextInt();
			ap.setProductId(ch);
			
			System.out.println("Enter Product Name : ");
			ap.setProductName(sc.next());
			
			System.out.println("Enter Product Price : ");
			ap.setProductPrice(sc.nextDouble());
			list.add(ap);
			
			
		}
		
		public void getData() {
			System.out.println("Id of Product: "+ap.getProductId()+"\nProduct Name: "+ap.getProductName()+"\nProduct Price: "+ap.getProductPrice());
			
		}
		
		public void update() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Press 1 for update ID\nPress 2 for update Name\nPress 3 for update Price ");
			switch(sc.nextInt()) {
			case 1: System.out.println("Enter New Id : ");
			int ch=sc.nextInt();
			ap.setProductId(ch);
			//System.out.print(LocalDateTime.time);
			
			case 2: System.out.println("Enter New Name : ");
			String ch2=sc.next();
			ap.setProductName(ch2);
			//System.out.print(LocalDateTime.time);
			
			case 3: System.out.println("Enter New Id : ");
			double ch3=sc.nextInt();
			ap.setProductPrice(ch3);
			//System.out.print(LocalDateTime.time);
			}
		}
		
		public void displayItems() {
		for(Appliances ap1 : list ) {
			System.out.println("Product Id= "+ap1.getProductId()+"\nProduct Name= "+ap1.getProductName()+"\nProduct Price= "+ap1.getProductPrice());
		}
		}
		
}
