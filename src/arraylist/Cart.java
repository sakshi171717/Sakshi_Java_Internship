package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public final class Cart {
	
	private ArrayList<Product> list;
	
	public Cart() {
		this.list=new ArrayList<>();
	}
	
	public void addItems(Product pd) {
		list.add(pd);
	}
	
	public void removeItems(String name) {

		Iterator itr= list.iterator();
		while(itr.hasNext()) {
			Product pd=(Product) itr.next();
			
			if (pd.getProductName()==name) {
				itr.remove();
			}
			
		}
	}

	public void displayItems() {
		for(Product pd1 : list ) {
			System.out.println("Product Name : "+pd1.getProductName()+"   Product Price : "+pd1.getProductPrice());
		}
	}


}
