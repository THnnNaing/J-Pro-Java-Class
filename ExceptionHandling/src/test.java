import java.util.Scanner;
import java.util.regex.Pattern;

public class test {

	public static void main(String[] args) {
		double num1, num2, ans;
		char op;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number:");
//		num1=sc.nextDouble(); //inputmismatchexception
		String n1=sc.next();
		while(!Pattern.matches("[0-9]{1,6}", n1)) {
			System.out.print("Input format wrrong, it must be double number, Type again:");
			n1=sc.next();
		}
		num1=Double.parseDouble(n1);
		
		//accept second number until correct
		System.out.print("Enter second number:");
		n1=sc.next();
		while(!Pattern.matches("[0-9]{1,6}", n1)) {
			System.out.print("Input format wrrong, it must be double number, Type again:");
			n1=sc.next();
		}
		num2=Double.parseDouble(n1);
		
		while (true) {
            System.out.print("Enter operator (+,-,*,/,%): ");
            n1 = sc.next();
            
            // Validate input using regular expression to ensure it's a single valid operator
            if (Pattern.matches("[+\\-*/%]", n1) && n1.length() == 1) {
                break; // Exit loop if valid input
            } else {
                System.out.println("Operator wrong, it must be +, -, *, /, or %");
            }
        }
        
        System.out.println("You entered a valid operator: " + n1);
        sc.close();
	}

}
