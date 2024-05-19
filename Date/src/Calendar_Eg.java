/**
 * java.util.Calendar
 * Calendar is abstract class
 * create object as
 * *	Calendar.getInstance();
 * *	can set and get each fields-Calendar.MONTH,Calendar.HOUR
 * *	to display->need to convert to java.util.Date(cal.getTime())
 */
import java.util.Calendar;
import java.util.Date;

public class Calendar_Eg {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();//current date and time
		Date d=cal.getTime();//conversion from Calendar to Date
		
		System.out.println("Current Date and Time: "+d);
		System.out.println("Current Date and Time: "+cal.getTime());//before displaying it is needed to convert to date
		
		//getting each fields-HOUR,MINUTES,MONTH,YEAR
		cal.set(Calendar.MONTH,0);//set to January
		cal.set(Calendar.DATE,28);//setting date value 1-31
		cal.set(Calendar.YEAR, 2020);
		System.out.println(cal.getTime());
		
		//getting each fields
		System.out.println("Current Month: "+(Calendar.getInstance().get(Calendar.MONTH)+1));//jan-0 ->need to add
    	System.out.println("Current Hour:"+Calendar.getInstance().get(0));
		
	}

}
