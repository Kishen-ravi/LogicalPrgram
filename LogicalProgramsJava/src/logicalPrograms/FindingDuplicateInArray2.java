package logicalPrograms;

public class FindingDuplicateInArray2 {

	public static void main(String[] ags){
		
		int[] arr = {1,2,3,4,5,6,6,8,9,8,8};
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println("Duplicates in the array :"+arr[j]);
					break;
				}
			}
		}
	}
}
