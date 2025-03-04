import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator {

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
		
		//accept operator -> +,-,*,/,%
		System.out.print("Enter operator (+,-,*,/,%):");
		n1=sc.next().substring(0,1);
		while(!Pattern.matches("[+\\-*/%]", n1)) {
			System.out.println("Operator wrong, it must be +,-,*,/ or %");
			n1=sc.next().substring(0,1);
		}
		op=n1.charAt(0);
		
		switch(op) {
		case'+':System.out.println(num1+"+"+num2+"="+(num1+num2));;break;
		case'-':System.out.println(num1+"-"+num2+"="+(num1-num2));;break;
		case'*':System.out.println(num1+"*"+num2+"="+(num1*num2));;break;
		case'/':
			try {
				System.out.println(num1+"/"+num2+"="+(num1/num2));
			}
			catch(ArithmeticException e) {
				System.out.println("Division by zero");
			}
			System.out.println(num1+"/"+num2+"="+(num1/num2));;break;
		case'%':
			try {
				System.out.println(num1+"%"+num2+"="+(num1%num2));
			}
			catch(ArithmeticException e) {
				System.out.println("Division by zero");
			}
			System.out.println(num1+"%"+num2+"="+(num1%num2));;break;
		}
	}

}
