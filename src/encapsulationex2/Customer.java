package encapsulationex2;

public class Customer {
	
	private int cust_id;
	private String cust_name;
	private int quantity;
	private double amt_by_cust;
	private double totalAmount;
	
	

	public Customer(int cust_id, String cust_name, int quantity,
			double amt_by_cust, double totalAmount) {
		super();
		this.cust_id= cust_id;
		this.cust_name=cust_name;
		this.quantity=quantity;
		this.amt_by_cust=amt_by_cust;
		this.totalAmount= totalAmount;
		
	}
	
	public int setCust_id(int cust_id) {
		this.cust_id=cust_id;
		return this.cust_id;
	}
	
	public String setCust_name(String cust_name) {
		this.cust_name=cust_name;
		return this.cust_name;
	}
	
	public int setQuantity(int quantity) {
		this.quantity=quantity;
		return this.quantity;
	}
	
	public double setAmt_by_cust(double amt_by_cust) {
		this.amt_by_cust=amt_by_cust;
		return this.amt_by_cust;
	}
	
	public static void getStockStatus(int quantity, int stocks) {
		
	}
	
	public Customer() {}
}




//constructor has no return type