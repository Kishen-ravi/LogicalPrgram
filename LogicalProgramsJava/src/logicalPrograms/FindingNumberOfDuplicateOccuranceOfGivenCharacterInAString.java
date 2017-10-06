package logicalPrograms;

public class FindingNumberOfDuplicateOccuranceOfGivenCharacterInAString {

	public static void main(String[] ags){
		String ip="aaabba"; 
		int count=0; 
		char [] charArray = ip.toCharArray();
		char givenChar = 'a';
		System.out.println("Duplicate Characters are as follows:"); 
			for(int i=0;i<ip.length();i++) 
			{ 
					if(charArray[i]==givenChar) 
					{ 
					count ++; 
					} 
			} 
			System.out.println(count);
	}
}
