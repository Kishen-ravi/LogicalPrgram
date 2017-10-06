package logicalPrograms;

import java.util.Arrays;

//not working
public class RemovingDuplicateElementInArray {

	public static void main(String[] ags){
		
		int[] arr = {1,2,3,3,4,5};
		
		int no_of_elements = arr.length;
		System.out.println("The elements in the array :"+Arrays.toString(arr));

		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					arr[j] = arr[no_of_elements-1];
					no_of_elements--;
					j--;
					
				}
			}
		}
		
		int[] arr1 = Arrays.copyOf(arr, no_of_elements);
		
		
		System.out.println("The unique elements in the array :"+Arrays.toString(arr1));
	}
}

