package task;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		System.out.println("Enter that number : ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		double s= Math.sqrt(n);
		//System.out.println("Next perfect square= "+s);
		
		if(s==Math.floor(s)) {
			s=s+1;
			int k= (int) Math.pow(s, 2);
			System.out.println("Next perfect square= "+k);
		}
		else {
			System.out.println("-1");
		}
	}

}
