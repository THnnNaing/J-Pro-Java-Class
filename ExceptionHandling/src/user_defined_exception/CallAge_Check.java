package user_defined_exception;

import java.util.Scanner;

public class CallAge_Check {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age(1 - 120):");
		age= sc.nextInt();
		
		if(age<1)
			throw new Age_Check("Your age is out of range, it must be greater than 0");
		else if (age>120)
			throw new Age_Check("Your age is out of range, it must be less than 121");
		else System.out.println("Correct input");
	}

}
