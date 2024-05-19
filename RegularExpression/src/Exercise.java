import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String inp;
		
		String pattern;
		pattern="Std-[0-9]{5}";//AP-4 digits or more
		System.out.println("Enter Student ID start with Std:");
		inp=sc.next();
		if(Pattern.matches(pattern,inp))System.out.println("Right input");
		else System.out.println("Wronginput");
		
		String name;
		
		pattern = "(Mr.|Ms.|Mrs.)[A-Z]{1}[a-z]*";
		System.out.println("Enter Student Name start with Mr.or Mrs. or Ms.:");
		name=sc.next();
		if(Pattern.matches(pattern,name))System.out.println("Right input");
		else System.out.println("Wronginput");
	}

}
