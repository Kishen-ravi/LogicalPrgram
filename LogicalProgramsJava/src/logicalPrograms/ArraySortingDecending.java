package logicalPrograms;

import java.util.Arrays;

public class ArraySortingDecending {

	
	public static void main(String[] ags){
		
		int[] array = {5, 78,2,69,23,569};
		
		
		for(int i=0;i<array.length;i++){
			int temp=0;
			for(int j=i+1;j<array.length;j++){
				if(array[i]<array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		//printing the sorted array
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}

/*Sorting the array in ascending order
Loop through the array and compare the first value with all other value, if the given number is small
Then switch the values*/