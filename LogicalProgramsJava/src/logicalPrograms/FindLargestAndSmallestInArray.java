package logicalPrograms;

import java.util.Arrays;

public class FindLargestAndSmallestInArray {

	public static void main(String[] ags){
		
		int[] arr = {1,5,2,8,3,7};
		Arrays.sort(arr);
		
		for(int a:arr){
			System.out.print(" "+a);
		}
		
		System.out.println("\nSmallest number :"+arr[0]);
		System.out.println("Largest number  :"+arr[arr.length-1]);
	}
}
