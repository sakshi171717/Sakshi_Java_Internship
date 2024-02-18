package string;

import java.util.Scanner;

public class Palindrome {
	
	public boolean palindromee(String str) {
		String rev="";
		for(int i=(str.length()-1); i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] arg) {
		Palindrome p=new Palindrome();
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String a= sc.nextLine();
	     boolean s= p.palindromee(a);
		if(s==true) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
	}

}
