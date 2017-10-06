package logicalPrograms;

public class PrintDuplicateInString {

	public static void main(String[] ag){
		String ip="aaabba"; 
		int count=0; 
		char [] charArray = ip.toCharArray(); 
		System.out.println("Duplicate Characters are as follows:"); 
			for(int i=0;i<ip.length();i++) 
			{ 
				for(int j=i+1;j<ip.length();j++) 
				{ 
					if(charArray[i]==charArray[j]) 
					{ 
					System.out.println(charArray[j]); 
					count ++; 
					break; 
					} 
				} 
			} 
			System.out.println("Total number of duplicates :"+count);
			

	}
}
