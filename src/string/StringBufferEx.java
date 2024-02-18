package string;

public class StringBufferEx {
	public static void main(String[] arg) {
		StringBuffer sb=new StringBuffer();
		sb.append("Pune");
		sb.append("-Mumbai");
		sb.append(10);	//autoboxing
		sb.append(false);	//Autoboxing
		System.out.println(sb);
	}

}
