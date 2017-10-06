package logicalPrograms;

public class FindingAverageOfArray {

	public static void main(String[] ags){
		
		int[] arr = {5,5,5,5,5};
		int total=0, average =0;
		for(int x:arr){
			total+=x;
		}
		average=total/arr.length;
		System.out.println("The average is  :"+average);
	}
}
