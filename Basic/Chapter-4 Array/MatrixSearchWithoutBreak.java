import	java.util.Scanner;
class MatrixSearchWithoutBreak{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m1[][]={{6,7,8,2,33}, {3,6,5,7,55}, {6,8,9,3,33}, {4,6,3,8,88}};
		int sNum, foundRIndex=-1, foundCIndex=-1, row=0, col=0;
		
		System.out.print("Enter number for matrix search : ");
		sNum =sc.nextInt();

		while(row<m1.length && foundRIndex ==-1){
			col=0;
			while(col<m1[row].length && foundCIndex ==-1){
				if (sNum==m1[row][col]) {
					foundRIndex=row;
					foundCIndex=col;
				}
				col++;
			}
			row++;
		}
		if(foundRIndex>-1){
			System.out.println("Found "+sNum+" at row "+(foundRIndex+1)+" and column "+(foundCIndex+1));
		}
		else{ 
			System.out.println("Not found");
		}
	}
}