package runtimepolymorphism_overriding;

public class Buisinessperson {
	public static void main(String[] args) {
		Prashant pt= new Prashant();
		pt.getOrange();	
	}

}
/* here abhishek and prashant both have same methods getOrange()
but here only prshant's method executed as a output beacause
Prashant's method has override the abhishek's method
(as Prashant extends Abhishek) 
(But if we create the seperate obj of abhishek then it's method executed)*/