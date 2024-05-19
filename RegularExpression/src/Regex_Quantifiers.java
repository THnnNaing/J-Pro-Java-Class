import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex_Quantifiers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp;
		
//		String pattern="A[a-z]?";//single character or none
//		System.out.println("Enter a lowercase string with no char or straight on:");
//		inp=sc.next();
		
//		String pattern="A[a-z]*";//none or more
//		System.out.println("Enter a lowercase string with one or more:");
//		inp=sc.next();
		
//		String pattern="A[a-z]+";//none or more
//		System.out.println("Enter a lowercase string with one or more:");
//		inp=sc.next();
		
//		String pattern="AP-[0-9]{4}";//AP-####
//		System.out.println("Enter string eg. AP-0000:");
//		inp=sc.next();
		
//		String pattern="AP-[0-9]{5}";//AP-4 digits or more
//		System.out.println("Enter string eg. AP-0000 or AP-00000:");
//		inp=sc.next();
		
		String pattern="AP-[0-9]{4,9}";//AP-4 up to 9
		System.out.println("Enter string eg. AP-0000 or AP-00000000:");
		inp=sc.next();
		
		if(Pattern.matches(pattern,inp))System.out.println("Right input");
		else System.out.println("Wronginput");
	}

}
