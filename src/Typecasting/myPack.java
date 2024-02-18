package Typecasting;

public class myPack {
	
	public static void main(String[] args)
	{
		//boxing
		// converting of premitive data types into wrapper classes
		int a= 10;
		Integer b= Integer.valueOf(a); //converted int primitive into Integer wrapper
		
		int aa=10;
		Integer i=Integer.valueOf(aa);
		
		Integer ii=20;
		int s=ii.intValue();
		
		int w= 30;
		String l= Integer.toString(w);
		
		//unboxing
		//converting wrapper classes into premitive data types
		Integer d=20;
		int r= d.intValue();  // Converted Integer wrapper into int primitive
		
		byte ab=3;
		String jk= Byte.toString(ab);  //converted byte primitive into String wrapper
		
		String gb= "123" ;
		int k= Integer.parseInt(gb); //converted String wrapper into int primitive
		
		Integer it= 12;
		String kt= Integer.toString(it);  // converted Integer wrapper into String wrapper
		
		String abc= "KBP";
		Integer bnf= Integer.parseInt(abc);  //converted String wrapper into Integer wrapper
	}
}


// the function that have parameters are static functions here
// like valueOf, toString, parseInt and intvalue is non-static function because it uses a n object to call itself(object of Interger class)