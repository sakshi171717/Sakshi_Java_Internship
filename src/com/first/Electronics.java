package com.first;
import java.util.*;

public class Electronics {
	public static void main(String[] arg) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("******************** XYZ Electronics*******************");
		
		System.out.println("Choose for the appliances : ");
		System.out.println("Press 1 for TV");
		System.out.println("Press 2 for Washing Machine");
		System.out.println("Press 3 for Fridge");
		
		int i= sc.nextInt();
		if(i<3) {
			
			switch(i) {
			
			case 1: 
					System.out.println("Choose for the brands : ");
					System.out.println("Press 1 for Panasonic");
					System.out.println("Press 2 for Sony");
					System.out.println("Press 3 for LG");
					int j= sc.nextInt();
					
					if(j!=0&&j<=3) {
					switch(j) {     
					
					case 1: System.out.println("Choose for the Models of Panasonic : ");
							System.out.println("Press 1 for X300");
							System.out.println("Press 2 for sg1200");
							System.out.println("Press 3 for PP671");
							 int k= sc.nextInt();
							 
							 if(k!=0&&k<=3) {
								 
								 switch(k) {
								 
								 case 1: 
								 System.out.println("Features of X300 : ");
								 System.out.println("Price of Model : 36000");
								 System.out.println("Warenty : 3yrs");
								 
								 case 2: 
									 System.out.println("Features of sg1200 : ");
									 System.out.println("Price of Model : 34000");
									 System.out.println("Warenty : 2yrs");
									 
								 case 3: 
									 System.out.println("Features of PP371 : ");
									 System.out.println("Price of Model : 10000");
									 System.out.println("Warenty : 10yrs");
								 }
							 }else {
								 System.out.println("Incorrect Choice");
							 }
							 
					case 2: System.out.println("Choose for the Models of Sony : ");
					System.out.println("Press 1 for 22rp");
					System.out.println("Press 2 for kk56");
					System.out.println("Press 3 for hg56");
					 int h= sc.nextInt();
					 
					 if(h!=0&&h<=3) {
						 
						 switch(h) {
						 
						 case 1: 
						 
						 
						 case 2: 
							 System.out.println("Features of kk56 : ");
							 System.out.println("Price of Model : 34000");
							 System.out.println("Warenty : 5yrs");
							 
						 case 3: 
							 System.out.println("Features of hg56 : ");
							 System.out.println("Price of Model : 10000");
							 System.out.println("Warenty : 8yrs");
						 }
					 }else {
						 System.out.println("Incorrect Choice");
					 }
					 
					case 3: System.out.println("Choose for the Models of LG: ");
					System.out.println("Press 1 for rt45");
					System.out.println("Press 2 for J67");
					System.out.println("Press 3 for Ke29");
					 int p= sc.nextInt();
					 
					 if(p!=0&&p<=3) {
						 
						 switch(p) {
						 
						 case 1: 
						 System.out.println("Features of rt45 : ");
						 System.out.println("Price of Model : 36000");
						 System.out.println("Warenty : 3yrs");
						 
						 case 2: 
							 System.out.println("Features of J67 : ");
							 System.out.println("Price of Model : 34000");
							 System.out.println("Warenty : 2yrs");
							 
						 case 3: 
							 System.out.println("Features of Ke29 : ");
							 System.out.println("Price of Model : 10000");
							 System.out.println("Warenty : 10yrs");
						 }
					 }else {
						 System.out.println("Incorrect Choice");
					 }
					
					}
					
					
					}else {
						System.out.println("Incorrect choice");
					}
				
					
					
			case 2: 
				System.out.println("Choose for the brands For Washing machine : ");
				System.out.println("Press 1 for Whirlpool");
				System.out.println("Press 2 for Wipro");
				System.out.println("Press 3 for LG");
				int s= sc.nextInt();
				
				switch(s) {
				
				case 1: System.out.println("Choose for the Models of Whirlpool : ");
						System.out.println("Press 1 for qwe");
						System.out.println("Press 2 for sasd");
						System.out.println("Press 3 for asd");
						 int k= sc.nextInt();
							 
							 switch(k) {
							 
							 case 1: 
							 System.out.println("Features of qwe : ");
							 System.out.println("Price of Model : 36000");
							 System.out.println("Warenty : 3yrs");
							 
							 case 2: 
								 System.out.println("Features of sasd : ");
								 System.out.println("Price of Model : 34000");
								 System.out.println("Warenty : 2yrs");
								 
							 case 3: 
								 System.out.println("Features of asd : ");
								 System.out.println("Price of Model : 10000");
								 System.out.println("Warenty : 10yrs");
								 
							default: System.out.println("Incorrect Choice");
							
							 }
						 
				case 2: System.out.println("Choose for the Models of Wipro : ");
				System.out.println("Press 1 for rty");
				System.out.println("Press 2 for hjk");
				System.out.println("Press 3 for op90");
				 int h= sc.nextInt();
					 
					 switch(h) {
					 
					 case 1: 
					 System.out.println("Features of 22rp : ");
					 System.out.println("Price of Model : 8900");
					 System.out.println("Warenty : 3yrs");
					 
					 case 2: 
						 System.out.println("Features of kk56 : ");
						 System.out.println("Price of Model : 34000");
						 System.out.println("Warenty : 5yrs");
						 
					 case 3: 
						 System.out.println("Features of hg56 : ");
						 System.out.println("Price of Model : 10000");
						 System.out.println("Warenty : 8yrs");
					 }
				 
				case 3: System.out.println("Choose for the Models of LG: ");
				System.out.println("Press 1 for rt45");
				System.out.println("Press 2 for J67");
				System.out.println("Press 3 for Ke29");
				 int p= sc.nextInt();
				 
					 switch(p) {
					 
					 case 1: 
					 System.out.println("Features of rt45 : ");
					 System.out.println("Price of Model : 36000");
					 System.out.println("Warenty : 3yrs");
					 
					 case 2: 
						 System.out.println("Features of J67 : ");
						 System.out.println("Price of Model : 34000");
						 System.out.println("Warenty : 2yrs");
						 
					 case 3: 
						 System.out.println("Features of Ke29 : ");
						 System.out.println("Price of Model : 10000");
						 System.out.println("Warenty : 10yrs");
					 }
				}
			
					
			}
			
			
		}
		else { //else if i
			System.out.println("Wrong Choice");
		}
		sc.close();
	}

}
