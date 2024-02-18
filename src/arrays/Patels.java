package arrays;

import java.util.Scanner;

public class Patels {
	public String ab(String a[]) {
		String b="";
		System.out.println("\nEnter the no. of Patels of rose");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		for(int i=1;i<=c;i++) {
			if(i==a.length) {
				i=1;
			}
			b= a[i];
		}
		return b;
	}
	
	public static void main(String[] arg) {
		Patels t=new Patels();
		String a[]= {"I Love You","1.alot","2.more","3.passionate","4.madely","5.truely"};
		System.out.println("Patels Conditions:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		String s=t.ab(a);
		System.out.println("\nThe final Patel Dicision: "+s);
	}

}
