import java.util.Date;

public class DateEg {

	public static void main(String[] args) {
		Date d1=new Date();//current date and time
		Date d2=new Date(100000);//given with milliseconds
		Date d3=new Date(100);
		
		System.out.println("Fist second"+d3);
		System.out.println("Second Date"+d2);
		System.out.println("Current Date and Time"+d1);
		
		System.out.println("To String: "+d1.toString()); // 24 format in local place 
		System.out.println("To Local String: "+d1.toLocaleString()); // local place time
		System.out.println("To GMT String: "+d1.toGMTString()); // greenwich mean time
		
		System.out.println("Before: "+d1.before(d2));//false
		System.out.println("After: "+d1.after(d2));//true
		System.out.println("Compare to: "+d1.compareTo(d2));//1
		System.out.println("Equals: "+d1.equals(d2));//false
	}

}
