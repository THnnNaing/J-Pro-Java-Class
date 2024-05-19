import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMaatchExep_Eg {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		try {
			num=sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Input format error...Your number must be integer value");
		}
	}

}
