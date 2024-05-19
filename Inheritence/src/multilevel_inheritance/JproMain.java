package multilevel_inheritance;

import java.util.Scanner;

public class JproMain {

	public static void main(String[] args) {
		StudentManagementSystem sms = new StudentManagementSystem();
		
		char ch;
		Scanner sc = new Scanner(System.in);
		do {
			sms.SMSSystem();
			System.out.println("Go to Main Menu or not(y|n)?:");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='y');
	}

}
