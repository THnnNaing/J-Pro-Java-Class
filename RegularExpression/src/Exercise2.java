import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String inp;
		
		String pattern = "Mr\\.|Mrs\\.|Ms\\.[\\w]{5,}";
		System.out.println("Enter Student Name start with Mr.or Mrs. or Ms.:");
		inp=sc.next();
		if(Pattern.matches(pattern,inp))System.out.println("Right input");
		else System.out.println("Wronginput");
	}

}
