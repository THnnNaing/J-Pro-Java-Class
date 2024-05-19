import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex_Metacharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String inp;
		
//		String pattern="[\\d]"; // \d -any digits -> 0-9
//		System.out.println("Enter a string:");
		
//		String pattern="[\\D]"; // non-digits -> [^0-9]
//		System.out.println("Enter any one character not digit:");
		
//		String pattern="A[\\s]"; // whitespace character, short for [\t\n\x0B\f\r]
//		System.out.println("Enter any white space eg.tab or space orr etc:");
		
//		String pattern="A[\\s]"; // whitespace character, short for [\t\n\x0B\f\r]
//		System.out.println("Enter any white space eg.tab or space orr etc:");
		
//		String pattern="A[\\S]"; // NOT whitespace character, short for [\t\n\x0B\f\r]
//		System.out.println("Enter any character than whitespace:");
		
//		String pattern="[\\w]"; // a-zA-Z0-9
//		System.out.println("Enter any one character of uppercase, lowercase or digit:");
		
		String pattern="[\\W]"; // NOT a-zA-Z0-9
		System.out.println("Enter any one special character:");
		
		inp=sc.next();
		if(Pattern.matches(pattern, inp))
			System.out.println("Right input");
		else  
			System.out.println("Wrong input");
	}

}
