package logicalPrograms;

public class SwappingTwoNumberWithOutTempVariable {

	public static void main(String[] ags){
		int a=100,  b=50;
		System.out.println("Value of A:"+a+" "+"Value of B:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of A:"+a+" "+"Value of B:"+b);
	}
}
