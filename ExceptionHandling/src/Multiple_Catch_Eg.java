import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple_Catch_Eg {

	public static void main(String[] args) {
		int num1, num2, ans;
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.println("Enter Divident and divisor:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			
			ans=num1/num2;
			System.out.println(num1+"/"+num2+"="+ans);
		}
		
		catch(InputMismatchException id) {
			System.out.println("Input format error, they must be integer");
		}
		catch(ArithmeticException ae) {
			System.out.println("Division by zero error, divisor must not be zeroo");
		}
		catch(Exception e) {
			System.out.println("Error type is"+e.getMessage());
			System.out.println("Error is:"+e.getMessage());
		}

	}

}
