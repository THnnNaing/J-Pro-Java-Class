import java.util.Scanner;
class MatrixAdd{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m1[][]={{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}}; 
		int m2[][]=new int[4][4];
		int totM[][]=new int [4][4];

		System.out.println("Enter data for 4x4 Matrix : ");
		for (int row=0; row<m2.length; row++) {
			for (int col=0; col<m2[row].length ; col++) {
				m2[row][col]=sc.nextInt();
			}
		}

		for (int row=0; row<m2.length; row++) {
			for (int col=0; col<m2[row].length ; col++) {
				totM[row][col]=m1[row][col]+m2[row][col];
			}
		}

		System.out.println("Matrix 1 :");
		for (int row=0; row<m2.length; row++) {
			for (int col=0; col<m2[row].length ; col++) {
				System.out.print(m1[row][col]+" ");
			}
			System.out.println();
		}

		System.out.println("Matrix 2 :");
		for (int row=0; row<m2.length; row++) {
			for (int col=0; col<m2[row].length ; col++) {
				System.out.print(m2[row][col]+" ");
			}
			System.out.println();
		}

		System.out.println("Total Matrix :");
		for (int row=0; row<m2.length; row++) {
			for (int col=0; col<m2[row].length ; col++) {
				System.out.print(totM[row][col]+" ");
			}
			System.out.println();
		}
	}
}