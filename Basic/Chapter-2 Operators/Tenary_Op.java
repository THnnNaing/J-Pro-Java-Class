// Tenary_Op.java
import java.util.Scanner;
class Max{
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter two numbers : ");
		num1 =sc.nextInt();
		num2 =sc.nextInt();

		// (test)?true_statement:false_statement;
		int max=(num1>num2)?num1:num2;
		System.out.println("Maximun value : "+max);
	}
}