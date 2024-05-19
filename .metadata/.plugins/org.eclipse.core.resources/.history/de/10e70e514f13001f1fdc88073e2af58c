import java.util.Scanner;

public class Arithematic_Excep_Eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, ans;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter divident:");
		num1=sc.nextInt();
		System.out.println("Enter divisor(not zero):");
		num2=sc.nextInt();
		
		try {
			ans=num1/num2;
			System.out.println(num1+"/"+num2+"="+ans);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Division by zero error, you should be enter not zero for divisor...");
		}
		
		System.out.println("End of the program");
	}

}
