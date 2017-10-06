package logicalPrograms;

public class FindingGivenNumberInAArray {

	public static void main(String[] ags){
		
		int[] arr = {1,2,4,5,5,6,7,8};
		int givenNumber=5;
		boolean bol= false;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==givenNumber){
				System.out.println("The given number "+givenNumber+" is present the array at index "+i);
				bol=true;
				break;
			}
		}
		if(!bol){
			System.out.println("The given number "+givenNumber+" is not present the array");
		}
	}
}
