package logicalPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindingDuplicateInArray {

	public static void main(String[] ags){
		int[] a ={1,2,2,3,2,3,4};
		HashSet<Integer> withOutDuplicates = new HashSet<Integer>();
		List<Integer> duplicates = new ArrayList<Integer>();

		withOutDuplicates.add(a[0]);
		for(int i=1;i<a.length;i++){
			if(withOutDuplicates.contains(a[i])){
				duplicates.add(a[i]);
			}
			else{
				withOutDuplicates.add(a[i]);
			}
		}
				
		System.out.println("Array with out duplicates :");
		for(int temp: withOutDuplicates){
			System.out.print(" "+temp);
		}
		
		System.out.println("\nDuplicates in the Array :");
		for(int temp: duplicates){
			System.out.print(" "+temp);
		}
		
	}
}
