package string;

import java.util.Scanner;

public class AlternateCapital {
	
	public String altletter(String str) {
		String s="";
		for(int i=0;i<str.length();i++) {
			
			if(i%2==0) {
				s=s+Character.toUpperCase(str.charAt(i));
				
			}else {
				s=s+Character.toLowerCase(str.charAt(i));
			}
			
		}
			
		return s;
	}
	
	public static void main(String[] args) {
		AlternateCapital ac= new AlternateCapital();
		System.out.println("Enter the String: ");
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println("String Converted\n"+ac.altletter(s));
	}

}
