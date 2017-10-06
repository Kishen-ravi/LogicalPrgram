package logicalPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicatesInAString {

	
	
	public static void main(String[] ags){
		String  str="Java";
		System.out.println(removeDuplicate(str));
		

	}
	public static String removeDuplicate(String str){
		Set<Character> sampleSet=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		
		for(int i=0; i<str.length()-1;i++){
			Character c=str.charAt(i);
			if(!sampleSet.contains(c)){
				sampleSet.add(c);
				sf.append(c);
			}				
		}		
		return "Removed duplicates is:"+sf.toString();
	}
}
