import java.util.Scanner;
class Probability{
	static void starLine(int n, char ch){
	for (int i=1; i<=n ; i++) 
		System.out.print(ch);
		System.out.println();
	}
	static void menu(){
		starLine(30,'-');
		System.out.println("\t Menu List");
		starLine(30,'-');
		System.out.println(" 1. Factorial (n!)");
		System.out.println(" 2. Permutation (nPr)");
		System.out.println(" 3. Combination (nCr)");
		System.out.println(" 4. Probability (fav/poss)");
		System.out.println(" 5. Exit ");
		starLine(30,'-');
		System.out.print(" Choose (1-5) : ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int opt;
		char ch;

		lbl:
		do{
			menu()
			opt = sc.nextInt();
			if (opt == 5) {
				// System.exit(0);
				break lbl;
			}
		}
	}
}