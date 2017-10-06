package logicalPrograms;

public class ReverseEachWordInAString {

	public static void main(String[] ags){
		
		String str = "java is a prgramming language";
		
		String[] words = str.trim().split(" ");
		
		for(int i=0;i<words.length;i++){
			for(int j=words[i].length()-1;j>=0;j--){
				System.out.print(words[i].charAt(j));
			}
			System.out.print(" ");
		}
		
	}
}
