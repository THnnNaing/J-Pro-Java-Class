import java.util.Scanner;

class TimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter the first time:");
        // int hours1 = getIntInput("Enter hours: ");
        // int minutes1 = getIntInput("Enter minutes: ");
        // int seconds1 = getIntInput("Enter seconds: ");

        // System.out.println("Enter the second time:");
        // int hours2 = getIntInput("Enter hours: ");
        // int minutes2 = getIntInput("Enter minutes: ");
        // int seconds2 = getIntInput("Enter seconds: ");

        // int totalSeconds = hours1 * 3600 + minutes1 * 60 + seconds1 +
        //                    hours2 * 3600 + minutes2 * 60 + seconds2;

        // int totalHours = totalSeconds / 3600;
        // int remainingSeconds = totalSeconds % 3600;
        // int totalMinutes = remainingSeconds / 60;
        // int totalSecondsOutput = remainingSeconds % 60;

        // System.out.println("Total time: " + totalHours + ":" + totalMinutes + ":" + totalSecondsOutput);

        // scanner.close();
        // ===============================================

        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // if (number % 2 == 0) {
        //     System.out.println(number + " is an even number.");
        // } else {
        //     System.out.println(number + " is an odd number.");
        // }
        // ===============================================

        // System.out.print("Enter a number between 1 and 12: ");
        // int monthNumber = scanner.nextInt();

        // switch(monthNumber){
        //     case 1:System.out.println("January");break;
        //     case 2:System.out.println("February");break;
        //     case 3:System.out.println("March");break;
        //     case 4:System.out.println("April");break;
        //     case 5:System.out.println("May");break;
        //     case 6:System.out.println("June");break;
        //     case 7:System.out.println("July");break;
        //     case 8:System.out.println("August");break;
        //     case 9:System.out.println("September");break;
        //     case 10:System.out.println("October");break;
        //     case 11:System.out.println("November");break;
        //     case 12:System.out.println("December");break;
        //     default:System.out.println("There is no such a month");
        // }
        // scanner.close();

        // ===============================================

        // System.out.print("Enter the first number: ");
        // double num1 = scanner.nextDouble();

        // System.out.print("Enter the second number: ");
        // double num2 = scanner.nextDouble();

        // System.out.print("Enter the operator (+, -, *, /): ");
        // char operator = scanner.next().charAt(0);

       
        // double result = 0.0;
        // switch (operator) {
        //     case '+':result = num1 + num2;break;
        //     case '-':result = num1 - num2;break;
        //     case '*':result = num1 * num2;break;
        //     case '/':if (num2 != 0) {
        //                     result = num1 / num2;
        //                 } else {
        //                     System.out.println("Error: Cannot divide by zero.");
        //                 return;
        //                 }
        //             break;
        //     default:System.out.println("Just Enter +, -, *, or /.");
        // }

        // System.out.println("Result: " + result);

        // scanner.close();

        

        // long factorial = 1;
        // int num; // multiplication -> default is 1

        // System.out.print("Enter a number for Factorial Calculation: ");
        // num = scanner.nextInt();

        // if (num < 0) {
        //     System.out.println("Your number is a negative value, so can't calculate Factorial");
        // } else {
        //     int i = num;
        //     while (i >= 1) 
        //         factorial *= i;
        //         i--;
        //     }
        //     System.out.println(num + "! = " + factorial);
        // }

        // if (num < 0) {
        //     System.out.println("Your number is a negative value, so can't calculate Factorial");
        // } else {
        //     int i = num;
        //     do {
        //         factorial *= i;
        //         i--;
        //     } while (i >= 1);
        //     System.out.println(num + "! = " + factorial);
        // }

        // System.out.print("Enter the total seconds : ");
        // int totalSeconds=scanner.nextInt();

        // int totalHours = totalSeconds / 3600;
        // int remainingSeconds = totalSeconds % 3600;
        // int totalMinutes = remainingSeconds / 60;
        // int totalSecondsOutput = remainingSeconds % 60;

        // System.out.println("Total time: " + totalHours + ":" + totalMinutes + ":" + totalSecondsOutput);

        // scanner.close();

        

        // int multiplier = 3;
        // int times = 20;

        // System.out.println("Multiplication of 3, repeated 20 times:");

        // for (int i = 1; i <= times; i++) {
        //     int result = multiplier * i;
        //     System.out.print(result);
        // }


        // int limit = 500;
        // int firstTerm = 1;
        // int secondTerm = 1;

        // System.out.println("Fibonacci Sequence up to " + limit + ":");

        // while (firstTerm <= limit) {
        //     System.out.print(firstTerm + " ");

        //     int nextTerm = firstTerm + secondTerm;
        //     firstTerm = secondTerm;
        //     secondTerm = nextTerm;
        // }
        // int res;
        // for (int i=1; i<=20 ; i++) {
        //     res=i*5;
        //     System.out.print(res + " ");
        //     if (res%25==0) 
        //         System.out.println();
        // }
        // for (int i=1; i<=5; i++) {
        //     for (int j=1; j<=5; j++) {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        // int p;

        // System.out.print("Enter a value : ");
        // int n = scanner.nextInt();

        // System.out.print("Enter a value : ");
        // int r = scanner.nextInt();

        // int p = n*(n-1)*(n-2)*(n-3);

        // System.out.print("nPr : " +p);

        // int c, n, n1, n2, i, j;
        // int f1=1;
        // int f2=1;
        // int f3=1;
        // int ans;

        // System.out.print("enter first num :"); 
        // n1=scanner.nextInt();

        // System.out.print("enter first num :"); 
        // n2=scanner.nextInt();

        // for ( i=1 ; i<=n1; i++) {
        //     f1 *=i;
        // }

        // for ( j=1; j<=n2; j++) {
        //     f2 *= j;
        // }

        // c = n1-n2;
        // for (n=1; n<=c; n++) {
        //     f3 *= n;
        // }

        // ans=f1/(f2*f3);

        // System.out.print("nCr :" +ans);

        // int positiveCount = 0;
        // int negativeCount = 0;

        // System.out.println("Enter numbers (enter 0 to exit):");

        // while (true) {
        //     System.out.print("Enter a number: ");
        //     int number = scanner.nextInt();

        //     if (number == 0) {
        //         break; // Exit the loop if 0 is entered
        //     } else if (number > 0) {
        //         positiveCount++;
        //     } else {
        //         negativeCount++;
        //     }
        // }

        // System.out.println("Number of positive numbers: " + positiveCount);
        // System.out.println("Number of negative numbers: " + negativeCount);

        // int p,i,j,factorial1,factorial2,ans;
        // factorial1=1;
        // factorial2=1;
        // ans=0;

        // System.out.println("Enter n value : ");
        // int n=scanner.nextInt();
        // System.out.println("Enter r value : ");
        // int r=scanner.nextInt();

        // for (i=1;i>=n;i++){
        //     factorial1 = factorial1 +n;
        
        //     for(j=r;j>=1;j--){
        //         factorial2= factorial2+ j;
        //     }
        //     ans=factorial1*factorial2;
        // }
        // System.out.println(""+ans);

    }
}
