package stringBuffer;

public class Appliances {
		
		private int productId;
		private String productName;
		private double price;
		
		
		public int setProductId(int productId) {
			this.productId=productId;
			return productId;
		}
		
		public String setProductName(String productName) {
			this.productName=productName;
			return productName;
		}
		
		public double setProductPrice(double price) {
			this.price=price;
			return price;
		}
		

			public void getProductId() {
				System.out.println("Product ID= "+productId);
			}
			
			public void getProductName() {
				System.out.println("Product Name= "+productName);
			}
			
			public void getProductPrice() {
				System.out.println("Product Price= "+price);
				this.price=price;
				double i=price*.18;
				double j = price+i;
				System.out.println("The price with GST="+i);
			}

			
	

}
