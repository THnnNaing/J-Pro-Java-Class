import java.util.Scanner;

public class Throws_Eg {
//  throws only used in checked exception, required for compilation process
//	throws used in IOException, SQLException
//	not in unchecked exception and error
//	current program is unchecked exception needed
	public static void main(String[] args) throws ArithmeticException,Exception{
		int num1, num2, ans;
		Scanner sc = new Scanner (System.in);
		

			System.out.println("Enter Divident and divisor:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			
			ans=num1/num2;
			System.out.println(num1+"/"+num2+"="+ans);

		
	}

}
