package arrays;

import java.util.Scanner;

public class Task2 {
	boolean flag;
	public boolean num(int a[]) {
		
		System.out.println("Enter the number to search");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(number==a[i]) {
				flag= true;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] arg) {
		Task2 t=new Task2();
		int a[]= {10,20,30,40,10};
		boolean p= t.num(a);
		System.out.println(p);
	}
}
