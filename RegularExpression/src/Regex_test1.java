import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Regex(Regular Expression) Character Classes
 * 	=> any single character
 */

public class Regex_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String inp;
		
		/*
		System.out.println("Enter a character for test:");
		inp=sc.next();
		String pattern=".";//single character
		 */
		
		/*
		System.out.println("Enter a character (a or b or c):");
		inp=sc.next();
		String pattern="[abc]";//only a or b or c
		*/
		
		/*
	 	System.out.println("Enter any one character except a or b or :");
		inp=sc.next();
		String pattern="[^abc]";//accept any one character but not a or b or c
		 */
		
		/*
		System.out.println("Enter a character of upper case or lower case only :");
		inp=sc.next();
		String pattern="[a-zA-Z]";//accept a character with a to z or A to Z
		*/
		
		System.out.println("Enter a character of lower case only but not include m-u :");
		inp=sc.next();
		String pattern="[a-z && [^m-u]]";//accept a character within a to z but not m - u
		
		if(Pattern.matches(pattern, inp)) System.out.println("Input is right");
		else System.out.println("Input is wrong");
		
	}

}
