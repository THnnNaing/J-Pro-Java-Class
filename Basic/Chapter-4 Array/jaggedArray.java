// JaggedArray.java (array mhr row nk col a khan m tu tr)
import java.util.Scanner;
class JagggedArray{
	public static void main(String[] args) {
		int m[][]=new int[4][]; //missing th length of column data
		Scanner sc = new Scanner(System.in);

		m[0]=new int[3];
		m[1]=new int[4];	
		m[2]=new int[2];
		m[3]=new int[6];


		m[1][0]=5;
		m[1][1]=5;
		m[1][2]=5;
		m[1][3]=5;

		m[2][0]=6;
		m[2][1]=6;

		System.out.println("Enter 3 numbers for row 1 of Matrix data : ");

		for (int i=0; i<3; i++) {
			m[0][i]=sc.nextInt();
		}

		System.out.println("Matrix data : ");
		for (int row=0; row<m.length; row++){
			for (int col=0; col<m[row].length; col++){
				System.out.print(m[row][col]+"\t");
			}
			System.out.println();
		}
	}
}