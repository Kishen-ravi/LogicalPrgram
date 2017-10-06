package logicalPrograms;

import java.util.Arrays;

public class CheckingAnagramOfStrings {

	public static void main(String[] ags){
		String str1 = "Peek";
		String str2 = "kEep ";
		
		String copystr1 = str1.replaceAll(" ", "");
		String copystr2 = str2.replaceAll(" ", "");
		
		char[] chstr1 = copystr1.toLowerCase().toCharArray();
		char[] chstr2 = copystr2.toLowerCase().toCharArray();
		
		Arrays.sort(chstr1);
		Arrays.sort(chstr2);
		
		if(str1.trim().length()!=str2.trim().length()){
			System.out.println("The two strings "+str1+" and "+str2+" are not anagrams");

		}
		else if(Arrays.equals(chstr1, chstr2)){
			System.out.println("The two strings "+str1+" and "+str2+" are anagrams");
		}
		else{
			System.out.println("The two strings "+str1+" and "+str2+" are not anagrams");
		}
		
	}
}
