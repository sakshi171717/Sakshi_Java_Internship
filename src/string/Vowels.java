package string;

public class Vowels {
		public int cntVowels(String str) {
			int cnt=0;
			for (int i=0;i<str.length();i++) {
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
					cnt= cnt+1;
				}
			}
			return cnt;
		}
		
		public static void main(String[] args) {
			Vowels v=new Vowels();
			int a= v.cntVowels("Sakshi");
			System.out.println("Vowels in String= "+a);
		}
}
