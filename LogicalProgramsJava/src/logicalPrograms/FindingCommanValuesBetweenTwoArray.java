package logicalPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindingCommanValuesBetweenTwoArray {

	public static void main(String[] ags){
		int[] arr1 = {1,2,4,5,67,8,34};
		int[] arr2 = {2,5,45,645,32,8,23,1};
		
		
		System.out.println("The array 1 :"+Arrays.toString(arr1));
		System.out.println("The array 1 :"+Arrays.toString(arr2));
		
		Set duplicates = new HashSet();

		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					duplicates.add(arr1[i]);
				}
			}
		}
		System.out.println("The commom elements are  :"+duplicates);
	}
	
}
