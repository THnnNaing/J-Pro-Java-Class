import java.util.Scanner;
class calculatorV2  {
        

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

        do{
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

       
        double result = 0.0;
        switch (operator) {
            case '+':result = num1 + num2;break;
            case '-':result = num1 - num2;break;
            case '*':result = num1 * num2;break;
            case '/':if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: Cannot divide by zero.");
                        return;
                        }
                    break;
            default:System.out.println("Just Enter +, -, *, or /.");
        }
        System.out.println("Result: " + result);
        System.out.print("Continue or not (y|n)? :");
                        ch = sc.next().charAt(0);
        
        
        }while(ch=='y' || ch=='Y');
        
   }
}