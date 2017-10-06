package logicalPrograms;

import java.util.Arrays;

public class ReversingAnIntegerArray {

	public static void main(String[] ags){
		
		int[] arr = {1,2,3,4,5,6,7,8,9,0};
		int temp=0;
		System.out.println("The given array :"+Arrays.toString(arr));
		for(int i=0;i<arr.length/2;i++){
			temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		
		System.out.println("The reverse of the array :"+Arrays.toString(arr));
	}
}
