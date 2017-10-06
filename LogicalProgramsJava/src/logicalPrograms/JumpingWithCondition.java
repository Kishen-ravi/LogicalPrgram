package logicalPrograms;

public class JumpingWithCondition {

	
	//The value of x should jump from 0 to 20 with two values jumps two time consicutively and 1 jump any time
	public static void main(String[] ags){
		int counter=0;
		int temp = 0,x=0;
		while(x!=20){
			if(temp<2){
				x=x+2;
				temp++;
				counter++;
				System.out.print(x+" ");
			}
			else{
				x++;
				counter++;
				temp=0;
				System.out.print(x+" ");
			}
		}
		System.out.println("\nThe count :"+counter);
	}
}
