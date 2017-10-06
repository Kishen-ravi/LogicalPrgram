package logicalPrograms;

public class ReverseString2 {

	public static void main(String[] ags){
		String str ="java";
		String result ="";
		for(int i=str.length()-1;i>=0;i--){
			result +=str.charAt(i);
		}
		System.out.println("Reversed String :"+result);
	}
}
