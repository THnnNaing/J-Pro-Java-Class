import java.util.Scanner;
class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		char op;

		System.out.print("First Number : ");
		num1=sc.nextDouble();
		System.out.print("Operator (+, -, *, / or %) : ");
		op=sc.nextDouble();
		System.out.print("First Number : ");
		num2=sc.nextDouble();

		switch(op){
		case '+':System.out.println(num1+ " + " +num2+ " = " +(num1+num2)); break;
		case '-':System.out.println(num1+ " - " +num2+ " = " +(num1-num2)); break;
		case '*':System.out.println(num1+ " * " +num2+ " = " +(num1*num2)); break;
		case '/':System.out.println(num1+ " / " +num2+ " = " +(num1/num2)); break;
		case '%':System.out.println(num1+ " % " +num2+ " = " +(num1%num2)); break;
		default:System.out.println("Just Enter +, -, *, / or %.");
		}
	}
}	


// For loop (count control loop)  start, stop, step <-well know
// WHile loop