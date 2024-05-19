import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw_UncheckedExcept {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age(1 - 120):");
		age= sc.nextInt();
		
//		if(age<1 || age>120) System.out.println("Your age input is out of range");
		if(age<1 || age>120)
			throw new InputMismatchException("Your age input is out of range");
		else System.out.println("Correct input");
	}

}
