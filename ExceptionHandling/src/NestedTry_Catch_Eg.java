import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTry_Catch_Eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, ans;
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter divident and divisor:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			
			try {
				ans=num1/num2;
				System.out.println(num1+"/"+num2+"="+ans);
			}
			
			catch(ArithmeticException ae) {
				System.out.println("Division by zero error...Divisor must not be zero");
			}
		}
		
		catch(InputMismatchException ie) {
			System.out.println("Input format error,... it must be integer value");
		}

	}

}
