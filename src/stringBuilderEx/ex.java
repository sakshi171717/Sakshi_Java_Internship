package stringBuilderEx;

public class ex {
	public static void main(String[] arg) {
		StringBuilder sb= new StringBuilder();
		sb.append(false);
		sb.append("Pune");
		sb.append("-Mumbai");
		sb.insert(7,"hiii");
		System.out.println(sb);
	}

}
