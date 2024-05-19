import java.util.Scanner;

public class Probability {
	static Scanner sc = new Scanner(System.in); //global varibale->

    static void starLine(int n, char ch) {
        for (int i = 1; i <= n; i++)
            System.out.print(ch);
        System.out.println();
    }

    static void menu() {
        starLine(30, '-');
        System.out.println("\t Menu List");
        starLine(30, '-');
        System.out.println(" 1. Factorial (n!)");
        System.out.println(" 2. Permutation (nPr)");
        System.out.println(" 3. Combination (nCr)");
        System.out.println(" 4. Probability (fav/poss)");
        System.out.println(" 5. Exit ");
        starLine(30, '-');
        System.out.print(" Choose (1-5) : ");
    }

    static void fac(int num1) {
        long factorial = 1;
        if (num1 < 0) {
            System.out.println("Your number is negative value so can't calculate Factorial");
        } else {
            for (int i = num1; i >= 1; i--)
                factorial *= i;
            System.out.println(num1 + "! = " + factorial);
        }
    }

    static void per(int num1, int num2) {
        int permu1 = 1, permu2 = 1;
        for (int i = num1; i >= 1; i--) {
            permu1 *= i;
        }
        for (int i = num1 - num2; i >= 1; i--) {
            permu2 *= i;
        }
        if (num2 > num1) System.out.print("Error!");
        else System.out.println(num1 + "P" + num2 + " = " + (permu1 / permu2));
    }

    static void comb(int num1, int num2) {
        int c1 = 1, c2 = 1;
        for (int i = num1; i >= num1 - num2 + 1; i--) {
            c1 *= i;
        }
        for (int i = num2; i >= 1; i--) {
            c2 *= i;
        }
        System.out.println(num1 + "C" + num2 + " = " + (c1 / c2));
    }

    static void prob(int num1, int num2) {
        if (num2 == 0)
            System.out.println("Division by Zero");
        else
            System.out.println("Division of " + num2 + " from " + num1 + " : " + (num1 / (num2 * 1.0)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option, num1, num2;
        char ch='y';

        lbl: do {
            menu();
            option = sc.nextInt();

            if (option == 5) {
                break lbl; // Break the loop if option is 5
            } else if (option < 1 || option > 5) {
                System.out.println("Wrong Option!");
                continue; // Skip this iteration and continue with the next
            }

            if (option == 1) {
                System.out.println("Enter Your Number : ");
                num1 = sc.nextInt();
                fac(num1);
            } else {
                System.out.println("Enter Two Numbers : ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                switch (option) {
                    case 2:
                        per(num1, num2);
                        break;
                    case 3:
                        comb(num1, num2);
                        break;
                    case 4:
                        prob(num1, num2);
                        break;
                }
            }

            System.out.print("Continue or not (y|n) ? : ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

        starLine(40, '=');
        System.out.println("\t End of The Program");
        starLine(40, '=');
        sc.close(); // Close the scanner
    }
}
