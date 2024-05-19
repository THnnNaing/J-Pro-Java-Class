class StarLine{
	/*
	procedure ( no reutrn data, display result within the procedure
	)
	2 types
		* without parameter (input, process, output)
		* with parameters (process, output)
	*/
	static void starLine(){ //procedure without parameter
		System.out.println("********************");
	}

	static void starLine(int n){ //procedure with parameter
		for (int i=1;i<n ; i++) {
			System.out.print("*");	
		}
		System.out.println();
	}

	public static void main(String[] args) {
		starLine(40); //Function call 
		System.out.println(" Menu List ");
		starLine();
		System.out.println(" 1. Addition ");
		System.out.println(" 2. Subtraction ");
		System.out.println(" 3. Multiplication ");
		System.out.println(" 4. Division ");
		starLine(40);
	}
}