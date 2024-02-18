package string;

public class ReverseString {
	
	public static String revString(String str) {
		String s="";
		for(int i=(str.length()-1); i>=0;i--) {
			s=s+str.charAt(i);
		}
		return s;
	}
	
	public static void main(String[] arg) {
		ReverseString t= new ReverseString();
		String strr= t.revString("sakshi");
		System.out.println("Reversed String = "+strr);
	}

}
