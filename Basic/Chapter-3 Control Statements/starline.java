class starline{
	public static void main(String[] args) {
		// System.out.println("**********");

		// for (int i=1; i<=10 ; i++ ) {
		// 	System.out.print("*");
		// 	System.out.println();	
		// }

		// for (int line=5; line>=1  ; line-- ) {
		// 	for (int star=1 ; star<=line ;  star++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }

		// for (int line=1; line<=5  ; line++ ) {
		// 	for (int star=1 ; star<=line ;  star++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }

		for (int line=1; line<=5 ; line++ ) {
			for (int sp=1; sp<=5-line; sp++ ) 
				System.out.print(" ");
				for (int st=1; st<=line ;st++ ) 
				System.out.print("* ");
			System.out.println();
		}
	}

}