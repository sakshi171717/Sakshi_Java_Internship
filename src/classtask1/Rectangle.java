package classtask1;

import java.util.Scanner;

public class Rectangle implements shape{

	@Override
	public void calculateArea() {
		System.out.println("Enter the length and the breadth of rectangle: ");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		float c= (float) (a*b);
		System.out.println("Area of the Rectangle= "+c);
		
	}

}
