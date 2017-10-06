package logicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArrayAndViceVersa {

	public static void main(String[] ags){
		
		String[] str = {"java","is","OOPS","programming"};
		ArrayList arraylist = new ArrayList(Arrays.asList(str));
		
		String[] strcopy = new String[arraylist.size()];
		arraylist.toArray(strcopy);
		
		System.out.println(arraylist);
		System.out.println(Arrays.toString(strcopy));
	}
}
