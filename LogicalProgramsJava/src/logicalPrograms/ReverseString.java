package logicalPrograms;

public class ReverseString {

	public static void main(String[] ags){
		String str ="java";
		StringBuffer sb = new StringBuffer();
		
		for(int i=str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		System.out.println("Reversed String :"+sb.toString());
	}
}
