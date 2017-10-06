package logicalPrograms;

public class ReverseNumber1 {

	public static void main(String[] ags){
		int num = 1234, reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
	}
}
