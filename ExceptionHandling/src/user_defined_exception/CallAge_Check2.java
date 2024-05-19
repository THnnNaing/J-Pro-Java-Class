package user_defined_exception;

import java.util.Scanner;

public class CallAge_Check2 {
	
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age(1 - 120):");
		age= sc.nextInt();
	
		try {
			new Age_Check().validate(age);
		}
		catch(Age_Check a) {
//			System.out.println("Error type:"+a.getMessage());
			System.out.println("Error type:"+a.toString());
		}
	}
}
