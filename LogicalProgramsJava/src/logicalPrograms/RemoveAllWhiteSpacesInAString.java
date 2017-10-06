package logicalPrograms;

public class RemoveAllWhiteSpacesInAString {

	public static void main(String[] ags){
		String str = "hai, dude how are you today";
		
		str = str.trim().replaceAll(" ", "");
		System.out.println("Removed all white spaces");
		System.out.println(str);
	}
}
