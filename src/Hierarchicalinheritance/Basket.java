package Hierarchicalinheritance;


public class Basket {
	
	public static void main(String[] arg) {
		Rohit rt=new Rohit();
		rt.getCherry();
		rt.getOrange();
		rt.getMango();
		
		
		// inheritance flow Prashant->Abhishek->Sahil, Abhishek->Yash, Abhishek->Rohit 
		/*Here rohit's flow= Prashant->Abhishek->Rohit so 
		 * rohit can access oranges by Prashant, 
		 * cherries by Abhishek, 
		 * and mongoes of itself*/
		
		Yash yt=new Yash();
		yt.getApple();
		yt.getCherry();
		yt.getOrange();
		
		/*Here Yash's flow= Prashant->Abhishek->Yash 
		 * Yash can access oranges by Prashant, 
		 * cherries by Abhishek, 
		 * and Apples of itself*/
		
		Sahil sa =new Sahil();
		sa.getOrange();
		sa.getStrawberry();
		
		/*Here Sahil's flow= Prashant->Sahil so 
		 * Sahil can access oranges by Prashant,  
		 * and Strawberries of itself*/
		
		Abhishek ab= new Abhishek();
		ab.getCherry();
		ab.getOrange();
		
		/*Here Abhishek's flow= Prashant->Abhishek so 
		 * Abhishek can access oranges by Prashant,  
		 * and Cherries of itself*/
		
		Prashant pt= new Prashant();
		pt.getOrange();
		
		// Prashant can only acces the oranges because its the main parent class  
	}

}
