class martrixSum{
	public static void main(String[] args) {
		int m[][]={{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}}; //{{row},{row},{row},{row}}
		int sum=0;

		for (int row=0; row<4; row++) {
			for (int col=0; col<4; col++) {
				System.out.print(m[row][col]+" ");
				sum+=m[row][col];
			}
			System.out.println();
		}
		System.out.println("Sum of matrix value : "+sum);
	}
}