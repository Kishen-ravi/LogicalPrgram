package logicalPrograms;

public class FindValueWhichIsPresentOnceInArray {

	public static void main(String[] ags){
		int[] arr = {1,1,2,2,3,3,4,5,5};
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==arr[i+1]){
				i++;
				continue;
				}
				else{
					System.out.println("result :"+arr[i]);
				}
		}
	}
}
