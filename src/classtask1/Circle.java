package classtask1;

import java.util.Scanner;

public class Circle implements shape{

	@Override
	public void calculateArea() {
		System.out.println("Enter the radius of the circle: ");
		Scanner sc = new Scanner(System.in);
		int r= sc.nextInt();
		float a= (float) (2*3.14*r);
		System.out.println("Area of the Circle= "+a);
	}

}
