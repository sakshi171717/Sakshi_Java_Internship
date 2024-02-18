package string;

public class CharCntInStr {
	static int cnt=0;
	public int strCount(String str, char letter) {
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==letter) {
				cnt=cnt+1;
			} 
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		CharCntInStr t=new CharCntInStr();
		int count= t.strCount("Hello", 'l');
		System.out.println("In the word Hello, l comes "+count+" times");
		
	}

}
