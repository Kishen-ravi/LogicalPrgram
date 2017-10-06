package logicalPrograms;

public class ReverseString3 {

	public static void main(String[] ag) {
		String str = "java";
		char[] result = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(result[i]);
		}
	}
}
