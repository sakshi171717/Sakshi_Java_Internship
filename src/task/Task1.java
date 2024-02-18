package task;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the count of the numbers: ");
		int cnt= sc.nextInt();
		System.out.println("Enter the numbers : ");
		int[] a= new int[cnt];
		int grtno=0;
		
		for(int i=0;i<cnt;i++) {
			a[i]= sc.nextInt();
		}
		
		for(int i=0;i<cnt;i++) {
			for(int j=1; j<cnt;j++) {
			if(a[j]>a[i]) {
				grtno=a[j];
			}}
		}
		System.out.print(grtno);
	}

}
