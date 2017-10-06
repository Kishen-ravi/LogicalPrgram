package logicalPrograms;

public class ConvertingStringToIntergerAndIntegerToString {

	public static void main(String[] ags){
		
		//String to int with Integer.parseInt()
		String str1 ="958";
		int i1 = Integer.parseInt(str1);
		System.out.println("String to int with Integer.parseInt() :"+i1);
		
		//String to int with Integer.valueOf()
		String str2 ="567";
		int i2 = Integer.valueOf(str2);
		System.out.println("String to int with Integer.valueOf() :"+i2);
		
		//int to String with Integer.toString()
		int i3 = 567;
		String str3 = Integer.toString(i3);
		System.out.println("int to String with Integer.toString() :"+str3);
		
		//int to String with String.valueOf()
		int i4 = 67;
		String str4 = String.valueOf(i4);
		System.out.println("int to String with String.valueOf() :"+str4);
	}
}
