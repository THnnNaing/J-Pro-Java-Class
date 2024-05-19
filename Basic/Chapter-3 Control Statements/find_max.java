// max of two values -> max=(num1>num2)?num1:num2; 
// max of three values
import java.util.Scanner;
class FindMax{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2 , num3; 

		System.out.println("Enter Three Numbers");
		num1= sc.nextInt();
		num2= sc.nextInt();
		num3= sc.nextInt();

		// num1> num2 and num1>num3 -> num1
		// num2>num3 -> num2
		// num3
		if (num1>num2 && num1>num3) 
			System.out.println("Maximun is "+num1);
		else if(num2>num3)
			System.out.println("Maximun is "+num2);
		else	System.out.println("Maximun is "+num3);
	}
}