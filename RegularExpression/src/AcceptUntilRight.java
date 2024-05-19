import java.util.Scanner;
import java.util.regex.Pattern;

public class AcceptUntilRight {

	//check name
	static boolean checkName(String name) {
		String pattern = "(Mr.|Ms.|Mrs.)[A-Z]{1}[a-z]*";
		if(Pattern.matches(pattern, name)) return true;
		return false;
	}
	
	//check id
	static boolean checkID(String id) {
		String pattern="Std-[0-9]{5}";
		if(Pattern.matches(pattern, id)) return true;
		return false;
	}
	
	//(2|4|6|7|8|9)[0-9]{8}
	//5[0-9]{6}
	static boolean checckPhoneNo(String ph) {
		String pattern="09(((2|4|6|7|8|9)[0-9]{8})|(5[0-9]{6}))";
		if(Pattern.matches(pattern, ph)) return true;
		return false;
	}
	
	//check age
	 static boolean checkAge(String age) {
	    if(Pattern.matches("[^0-9]+",age))return false;
		int a=Integer.parseInt(age); //may arrive error for conversion
	    if(a>0 && a<=120) return true;
	    return false;
	}
	
	//check date
	static boolean checkDate(String date) {
		//format -> dd-mm-yyyy, date -> 1 to 31, month -> 0 to 11
		//dd -> 0 -> 1 to 9, 1 -> 0-9, 2 -> 0-9, 3 -> 0 or 1
		//(0[1-9] | [12][0-9] | 3[01])
		//mm -> 0 -> 0-9, 1 -> 0 or1 
		//((0[0-9]) | (1[01]))
		String pattern="((0[1-9])|([12][0-9])|(3[01]))-((0[0-9])|(1[01]))-[0-9]{4}";
		if(Pattern.matches(pattern,date)) return true;
		return false;
	}
			
	public static void main(String[] args) {
//		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name started with Mr. or Mrs. or Ms. eg.Mr.John:");
//		name=sc.next();
		while(!checkName(sc.next())) {
			System.out.println("Your input name is wrong, it must be start with");
			System.out.println("Mr. or Mrs. or Ms. and not include any space");
			System.out.println("And followed by one captial letters and followed by any characterr");
			System.out.println("Eg.Mr.Joihn,Type again:");
//			name=sc.next();
			
			System.out.println("Enter Student IDI (eg.Std-00000):");
			while(!checkID(sc.next())) {
				System.out.println("Your ID is wrong, it must be start with Std-");
				System.out.println("and followed exactly 5 digits");
				System.out.println("Eg. Std-00000, Type again:");
			}
		}
		
	}

}
