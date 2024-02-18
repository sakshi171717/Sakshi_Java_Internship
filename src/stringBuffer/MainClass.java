package stringBuffer;

public class MainClass {
	
	public static void main(String[] arg) {
		StringBuffer sb=new StringBuffer();
		Appliances ap=new Appliances();
		ap.setProductId(1);
		ap.setProductName("ABC");
		ap.setProductPrice(100);
		sb.append(ap);
		System.out.println(sb);
	}

}
