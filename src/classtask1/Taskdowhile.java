package classtask1;

import java.util.Scanner;

public class Taskdowhile {
	
	public static void main(String[] arg) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter count the numbers\n");
		int c=sc.nextInt();
		System.out.println("Enter the numbers\n");
		for(int i=0;i<c;i++)
		{
			int n=sc.nextInt();
			do {
				System.out.println(n);	
				break;
				}while(n<0);
		}
			
	}

}
