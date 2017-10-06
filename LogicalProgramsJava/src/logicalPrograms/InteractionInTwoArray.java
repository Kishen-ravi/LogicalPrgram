package logicalPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class InteractionInTwoArray {

	public static void main(String[] ags){
		
		int[] arr1 ={1,4,5,3};
		int[] arr2 ={2,4,6,1};
		
		int[] arr3 = new int[arr1.length];
		int count=0;
		HashSet<Integer>  set = new HashSet<Integer>();
		for(int k:arr1){
			set.add(k);
		}
		
		for(int k:arr2){
			if(set.contains(k)){
				arr3[count]= k;
				count++;
			}
		}
		
		System.out.println("The interactons between two array :");
		for(int i:arr3){
			if(i!=0){
			System.out.print(" "+i);
			}
		}
	}
}
