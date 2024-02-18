package string;

public class CntCsonentsVowels {
	public String count(String str) {
		int cnt1=0;
		int cnt2=0;
		
		for (int i=0; i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				cnt1= cnt1+1;
			}
			else {
				cnt2=cnt2+1;
			}
			
		}
		System.out.println("Count of Vowels= "+cnt1);
		System.out.println("Count of Consonents= "+cnt2);
		
		
		return null;
	}
	
	public static void main(String[] arg) {
		CntCsonentsVowels cn= new CntCsonentsVowels();
		cn.count("Sakshi");
	}

}
