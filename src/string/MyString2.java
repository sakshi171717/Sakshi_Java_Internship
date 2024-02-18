package string;

public class MyString2 {
	
	public static void main(String[] args) {
		String a="Mumbai";
		String b= "Mumbai";
		String c= new String("Mumbai");
		
		System.out.println(a==b);	// here a nd b are pointing at same element in memory location cause they boyth contain similar string
		System.out.println(a.equals(b));
		
		System.out.println(a==c);  // here they contain same elements but different memory location so == gives false and .equals returns true
		System.out.println(a.equals(c));
		
	}

}
