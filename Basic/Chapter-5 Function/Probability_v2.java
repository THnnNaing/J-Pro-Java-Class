/*
 n! = n x n-1 x ... x2 x1
 nPr = n! / (n-r)!
 nCr = nPr / r!

 simple procedure => input, process, output
 procedure with parameters => input as arguments, process, output

 function => simple function => inuput, process, output -> return 
 function with parameters => input as arguments, process output -> return 
*/

import java.util.Scanner;
class Probability{
	//display star line based on user input n and ch
	static void starLine(int n,char ch){
		for(int i=1;i<=n;i++)
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
		System.out.println(" 5. Exit");
		starLine(30,'-');
		System.out.print("Choose (1-5) : ");
	}

	static int factorial(int num){
		int fact=1;
		for (int i=1; i<=num; i++ )
			fact *= i;
		return fact;	
	}

	static int nPr(int n, int r){
		// nPr = n! / (n-r)!
		// int permu = factorial(n) / factorial (n-r);
		// return permu;

		return factorial(n) / factorial (n-r);
	}

	static int nCr(int n, int r){
		// nCr = nPr / r!;
		return nPr(n,r) / factorial (r);
	}

	static double prob(int f, int p){
		if (p==0) return 0; 
		else return f/(p*1.0);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opt;
		char ch;

		lbl:
		do{
			menu();
			opt=sc.nextInt();

			switch(opt){
				case 1:{
				int num;
				System.out.print("Enter a number for Factorial calcuation : ");
				num = sc.nextInt();
				int ans = factorial(num); //using assignment statement
				System.out.println(num + " != "+ans);

				System.out.println(num+ " != "+factorial(num));
				};break;
				case 2:{
					int n,r;
					System.out.print("Enter n value for nPr : ");
					n = sc.nextInt();
					System.out.print("Enter r value for nPr : ");
					r = sc.nextInt();
					System.out.println(n+"P"+r+" = "+nPr(n,r));
				};break;
				case 3:{
					int n,r;
					System.out.print("Enter n value for nCr : ");
					n = sc.nextInt();
					System.out.print("Enter r value for nCr : ");
					r = sc.nextInt();
					System.out.println(n+"C"+r+" = "+nCr(n,r));
				};break;
				case 4:{
					int f,p;
					System.out.print("No. of favorable outcome : ");
					f = sc.nextInt();
					System.out.print("No. of possible outcome : ");
					p = sc.nextInt();
					System.out.println("Probability : "+prob(f,p));
				};break;
				case 5:break lbl;
				default:System.out.println("Wrong Option");
			}

			System.out.print("Continue or not (y|n) ? : ");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		starLine(50,'=');
		System.out.println("\t\t End of the Program");
		starLine(50,'=');
	}
}