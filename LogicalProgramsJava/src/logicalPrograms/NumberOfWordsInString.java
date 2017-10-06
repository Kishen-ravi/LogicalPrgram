package logicalPrograms;

public class NumberOfWordsInString {

	public static void main(String[] ags){
		String str= "hai my name is Java";
		
		String[] count = str.trim().split(" ");
		System.out.println("The number of words :"+count.length);
	}
}
