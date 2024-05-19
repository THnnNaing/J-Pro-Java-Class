 import java.util.Scanner;
 class Factorial_v2{
 	public static void main(String[] args) {
 		Scanner sc= new Scanner(System.in);
 		long factorial=1;
 		int num; // muliplication -> default is 1

 		System.out.print("Enter a number for Factorial Calculation : ");
 		num=sc.nextInt();

 		if (num<0) {
 			System.out.println("Your number is negative value so can't calculate Factorial");
 		}
 		else{
 			for (int i=num; i>=1; i-- ) 
 			factorial *=i;
 			System.out.println(num+"=!"+factorial);
 		}		
 	}
 }