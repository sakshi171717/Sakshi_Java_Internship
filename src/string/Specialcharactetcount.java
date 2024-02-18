package string;

import java.util.Scanner;

public class Specialcharactetcount {
	
		public String count(String str) {
			int cnt1=0;
			int cnt2=0;
			int cnt3=0;
			int cnt4=0;
			
			for (int i=0; i<str.length();i++) {
				
				if(Character.isLetter(str.charAt(i))) {
					cnt1=cnt1+1;
				}
				else if(Character.isDigit(str.charAt(i))){
					cnt2=cnt2+1;
				}
				else if(Character.isSpace(str.charAt(i))) {
					cnt3=cnt3+1;
				}
				else {
					cnt4=cnt4+1;
				}
			}
			System.out.println("Count of Letters= "+cnt1);
			System.out.println("Count of Digits= "+cnt2);
			System.out.println("Count of spaces= "+cnt3);
			System.out.println("Count Special Characters = "+cnt4);
			//System.out.println("Other characters= "+cnt3);
			
			
			return null;
		}
		
		public static void main(String[] arg) {
			Specialcharactetcount cn= new Specialcharactetcount ();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String: ");
			String s= sc.nextLine();
			System.out.println("The String have count of: ");
			cn.count(s);
		}

	}
