package arraylist;

public class Product {
	
	private String productName;
	private int price;
	
	public Product(String productName, int price) {
		super();
		this.productName= productName;
		this.price=price;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName= productName;
	}
	
	public int getProductPrice() {
		return price;
	}
	
	public void setProductPrice(int price) {
		this.price= price;
	}

}
