package arrays;

import java.util.Scanner;

public class task {
	
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the capacity of array");
		int c=sc.nextInt();
		int a[]=new int[c];
		System.out.println("Enter the Elements of array");
		for (int i=0;i<a[c];i++) {
			a[i]=sc.nextInt();
			System.out.println(a[i]);
		}
	}

}
