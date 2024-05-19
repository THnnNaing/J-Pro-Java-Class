package user_defined_exception;

import java.util.InputMismatchException;

public class Age_Check extends InputMismatchException {
	
	public Age_Check() {
		
	}
	
//	public void getMessage() {//override the parent class's method 
//		System.out.println("Age input out of range, it must be within 1 and 120");
//	}
	
	public Age_Check(String s) {
		System.out.println(s);
	}
	
	public static void validate(int age) {
		if(age<1)throw new Age_Check("Your age must be greater than zero");
		else if(age>120)throw new Age_Check("Your age must be less than 121");
		else System.out.println("Correct input");
	}

}
