package logicalPrograms;

public class ReverseNumber {

	public static void main(String[] ag){
		int number=123;
		int a, b,c,d;
		a=number%10;
		b=number/10;
		c=b%10;
		d=b/10;
		System.out.print(a);
//		System.out.println(b); //312
		System.out.print(c); 
		System.out.print(d); 
	}
}
