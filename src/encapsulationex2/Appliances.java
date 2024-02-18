package encapsulationex2;

import java.util.Scanner;

public class Appliances {
	
	private int productId;
	private String productName;
	private double price;
	
	
	public void setProductId(int productId) {
		this.productId=productId;
		//return productId;
	}
	
	public void setProductName(String productName) {
		this.productName=productName;
		//return productName;
	}
	
	public void setProductPrice(double price) {
		this.price=price;
		//return price;
	}
	

		public int getProductId() {
			return productId;
			//System.out.println("Product ID= "+productId);
		}
		
		public String getProductName() {
			return productName;
			//System.out.println("Product Name= "+productName);
		}
		
		public Double getProductPrice() {
			//System.out.println("Product Price= "+price);
			this.price=price;
			double i=price*.18;
			double j = price+i;
			//System.out.println("The price with GST="+i);
			return price;
		}

		
}
