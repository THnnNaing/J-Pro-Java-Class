// Row sum.java
class matrixA_RowSum{
	public static void main(String[] args) {
		int m[][]={{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}}; 
		
		System.out.println("Original Array : ");
		for(int row=0; row<m.length;row++){
				for (int col=0; col<m[row].length; col++) {
				System.out.print(m[row][col]+" ");
			}
			System.out.println();
		}

		int sum=0;
		for(int row=0; row<m.length;row++){
				for (int col=0; col<m[row].length; col++) {
				sum+=m[row][col];	
			}
		}
		System.out.println("Sum of all matrix data : "+sum);

		for(int row=0; row<m.length;row++){
			sum=0;
				for (int col=0; col<m[row].length; col++) {
				sum+=m[row][col];	
			}
			System.out.println("Sum of row "+(row+1)+ " is "+sum);
		}

		for (int col=0; col<4 ;col++ ) {
			for (int row=0; row<m.length; row++) {
				sum+=m[row][col];
			System.out.println("Sum of col "+(col+1)+ " is "+sum);
			}
		}
	}
}