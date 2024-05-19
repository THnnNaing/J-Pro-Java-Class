import java.util.Scanner;
class Menu{

	static void starLine(int n, char ch){
	for (int i=1; i<=n ; i++) 
		System.out.print(ch);
		System.out.println();
	}

	static void menu(){
		starLine(30,'-');
		System.out.println("\t Menu List");
		starLine(30,'-');
		System.out.println(" 1. Addition ");
		System.out.println(" 2. Subtraction ");
		System.out.println(" 3. Multiplication ");
		System.out.println(" 4. Division ");
		System.out.println(" 5. Exit ");
		starLine(30,'-');
		System.out.println(" Choose (1-5) : ");
	}

	static void menu(String mList[]){
		starLine(30,'-');
		System.out.println("\t Menu List");
		starLine(30,'-');

		for(int i=0; i<mList.length;i++)
			// 1.Add
			System.out.println(" "+(i+1)+". "+mList[i]);

		System.out.println(" "+(mList.length+1)+". Exit");
		starLine(30,'-');
		System.out.print("Choose(1-"+(mList.length+1)+") :");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt;
		char ch;
		lbl: 
		do{
			System.out.println("Continure or not (y|n) ? ");
			ch = sc.next().charAt(0);
		}while (ch=='y'||ch=='Y');
        starLine(40, '=');
		System.out.println("\t End of the Program");
		starLine(40, '=');

	}
}