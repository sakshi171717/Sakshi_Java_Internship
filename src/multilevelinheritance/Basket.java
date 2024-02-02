package multilevelinheritance;

public class Basket {
	public static void main(String[] arg) {
		Rohit rt=new Rohit();
		rt.getApple();
		rt.getMango();
		rt.getOrange();
		
		// inheritance flow Prashant->Yash->Rohit, so rohit can access oranges and apples by prashant and yash
		
		Yash yt=new Yash();
		yt.getApple();
		yt.getOrange();
		
		//yash extens prashant so it can acces orange and apples only and not the mangoes
		
		Prashant pt= new Prashant();
		pt.getOrange();
		
		// Prashant can only acces the oranges 
	}

}
