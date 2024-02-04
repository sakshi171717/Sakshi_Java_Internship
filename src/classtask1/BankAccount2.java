package classtask1;

import java.util.Scanner;

public class BankAccount2 extends BankAccount {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number: ");
		int a= sc.nextInt();
		System.out.println("Enter the bank balance: ");
		int b= sc.nextInt();
		
		BankAccount ba= new BankAccount();
		ba.setNumber(a);
		ba.setBalance(b);
		ba.getNumber();
		ba.getBalance();
	}

}
