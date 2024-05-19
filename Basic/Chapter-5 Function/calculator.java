import java.util.Scanner;
class Calculator{

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
		System.out.print(" Choose (1-5) : ");
	}

	static void add (int num1, int num2) {
		System.out.println("Addition of Your Two Numbers :"+ (num1 + num2));
	}

	static void sub (int num1, int num2) {
		System.out.println("Subtraction of "+ num2 + " from "+ num1 + " : " + (num1 - num2));
	}

	static void mul (int num1, int num2) {
		System.out.println("Multiplication of "+ num1 + " and "+ num2 + " : " + (num1 * num2));
	}

	static void div (int num1, int num2) {
		if (num2 == 0) System.out.println("Division by Zero");
		else System.out.println("Division of "+ num2 + " from "+ num1 + " : " + (num1 / (num2*1.0)));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option, num1, num2;
		char ch;
		lbl:
		do{
			menu();
			option = sc.nextInt();

			if (option == 5) {
				// System.exit(0);
				break lbl;
			}
			else if (option < 1 || option > 5) {
				System.out.println("Wrong Option!");
			}
			else{
				System.out.println("Enter Two Numbers : ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				switch(option){
					case 1:add(num1, num2); break;
					case 2:sub(num1, num2); break;
					case 3:mul(num1, num2); break;
					case 4:div(num1, num2); break;
				}
			}

			System.out.print("Continue or not (y|n) ? : ");
			ch = sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		starLine(40,'=');
		System.out.println("\t End of The Program");
		starLine(40,'=');
	}
}