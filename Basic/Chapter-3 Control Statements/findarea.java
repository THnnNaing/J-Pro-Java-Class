/*
	****************
	Select Formula
	****************
	1. Circle Area
	2. Triangle Area
	3. Rectangle Area
	4. Exit
	****************
	Choose : 1
	-----
	Continue or not (y|n)? : n
*/
import java.util.Scanner;
class findarea {
	public static void main(String[] args) {
		Scanner sc = new Scanner;
		int option;
		char ch; 
		do{
			//start of the menu
			System.out.println("*********************");
			System.out.println("Select Formula");
			System.out.println("*********************");
			System.out.println("1.Circle Area");
			System.out.println("2.Triangle Area");
			System.out.println("3.Rectangle Area");
			System.out.println("*********************");
			System.out.println("Choose (1-4) : ");
			option = sc.nextInt();
			//end of the menu

			switch(option){
				case 1:{
					//calculate circle area
					final double pi=3.142;
					double radius;
					System.out.print("Enter radius for a circle :");
					radius = sc.nextDouble();
					System.out.print("Area of Circle :"+ (pi * radius * radius));
				};break;
				case 2:{
					double b, h, a ;
					System.out.print("Enter base for a Triangle :");
					b = sc.nextDouble();
					System.out.print("Enter height for a Triangle :");
					h = sc.nextDouble();
					System.out.print("Area of Circle :"+ (0.5 * b * h));
				};break;
				case 3:{
					double b, h, a ;
					System.out.print("Enter base for a Rectangle :");
					b = sc.nextDouble();
					System.out.print("Enter height for a Rectangle :");
					h = sc.nextDouble();
					System.out.print("Area of Circle :"+ (b * h));
				};break;
				case 4:System.exit(0);break;
				System.out.println("Wrong option");
			}

			System.out.print("Continue or not (y|n)? :");
			ch = sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("*****End of the program*****");
	}
}