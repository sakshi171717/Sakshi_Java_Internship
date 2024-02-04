package classtask1;

import java.util.Scanner;

public class Calculator2 {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Enter for the operation you refer: ");
		System.out.println("1.Addition for integer\n2.Substraction\n3.Multiplication\n4.Division\n5.Addition of 3 numbers");
		int ch= sc.nextInt();
		switch(ch) {
		
		case 1: Calculator.Addition(a,b);
		break;
		
		case 2: Calculator.Substraction(a, b);
		break;
		
		case 3: Calculator.Multiplication(a, b);
		break;
		
		case 4: Calculator.Division(a, b);
		break;
		
		case 5: System.out.println("Enter 3rd number : ");
				int c= sc.nextInt();
			Calculator.Addition(a, b, c);
		break;
		
		default: System.out.println("Incorrect Credentials");
		break;
		}
	}

}
