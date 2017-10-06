package logicalPrograms;

public class PrintingDiagonalOfMatrix {

	public static void main(String[] ags){
		
		int[][] diagonalMatrix = new int[3][3];
		int k=0;
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				diagonalMatrix[i][j]=k;
				k++;
			}
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(diagonalMatrix[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("\nThe diagnal of the above matrix \n");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i==j){
					System.out.print(diagonalMatrix[i][j]+" ");
				}
			}
		}
		
	}
}
