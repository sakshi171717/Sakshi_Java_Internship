package arraylist;

import java.util.Scanner;

public class Operations {
	
	public static void main(String[] arg) {
		Product pd=new Product("Orange",100);
		Product pd1=new Product("Apple",200);
		Product pd2=new Product("Mango",300);
		Product pd3=new Product("Cherry",400);
		Product pd4=new Product("Banana",500);
		Product pd5=new Product("Guava",360);
		
		Cart cart=new Cart();
		
		cart.addItems(pd);
		cart.addItems(pd1);
		cart.addItems(pd2);
		cart.addItems(pd3);
		cart.addItems(pd4);
		cart.addItems(pd5);
		cart.displayItems();
		
		
		cart.removeItems("Mango");
		System.out.println("Deletion successful");
		cart.displayItems();
	}

}
