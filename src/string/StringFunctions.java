package string;

public class StringFunctions {
	
	public static void main(String[] arg) 
	{
		String a= new String("KBPCOE");
		String b= new String("Satara");
	    char c[] = {'a','b','c'};
		
		//System.out.println(char charAt(c[0]));
		System.out.println("1. "+a.charAt(4));
		System.out.println("2. "+a.concat(b));
		System.out.println(c.equals(b));
		System.out.println(a.indexOf(5));
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(b));
		System.out.println(a.codePointAt(4));
		System.out.println(a.contains("E"));
		System.out.println(a.endsWith("ra"));
		System.out.println(a.isBlank());
		System.out.println(a.lastIndexOf("a"));
		System.out.println(a.length());
		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		System.out.println(a.replace("P","E"));
	}
}
