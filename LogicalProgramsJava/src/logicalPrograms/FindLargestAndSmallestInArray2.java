package logicalPrograms;

public class FindLargestAndSmallestInArray2 {

	public static void main(String[] ags){
		
		int[] arr = {1,4,2,3,6,5,9,7};
		
		for(int i=0;i<arr.length;i++){
			int temp=0;
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int t:arr){
			System.out.print(" "+t);
		}
		
		System.out.println("\nSmallest number :"+arr[0]);
		System.out.println("Largest number  :"+arr[arr.length-1]);
	}
}
