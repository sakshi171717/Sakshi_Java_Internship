package string;

import java.util.Scanner;

public class AltVowels {
	public boolean vowels(String str) {
		boolean flag=false;
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.length()=='o'||str.charAt(i)=='u') {
					flag=true;
				}
			}
			else {
				flag= false;
			}
		}
		return flag;
	}
	
	public static void main(String[] arg) {
		AltVowels av= new AltVowels();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String a=sc.nextLine();
		boolean b= av.vowels(a);
		if(b==true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}

}

