import java.text.DateFormat;
import java.util.Date;

/**
 * Display format for java.util.Date
 * DateFormat-abstract class
 * object create->DateFormat.getInstance()
 * getInstance->Date and Time 
 */
public class DateFormatEg {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println("Current Date:"+d);
		String dformat=DateFormat.getInstance().format(d);
		System.out.println("Current Date with simple format"+dformat);
		
		//only Date value
		dformat=DateFormat.getDateInstance().format(d);
		System.out.println("Current Date Only: "+dformat);
		dformat=DateFormat.getDateInstance(DateFormat.LONG).format(d);
		System.out.println("Current Date Only(Long):"+dformat);
		dformat=DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
		System.out.println("Current Date Only(Medium):"+dformat);
		dformat=DateFormat.getDateInstance(DateFormat.SHORT).format(d);
		System.out.println("Current Date Only(Short):"+dformat);
		
		//only Time value
		dformat=DateFormat.getTimeInstance().format(d);
		System.out.println("Current Date Only: "+dformat);
		dformat=DateFormat.getTimeInstance(DateFormat.LONG).format(d);
		System.out.println("Current Date Only(Long):"+dformat);
		dformat=DateFormat.getTimeInstance(DateFormat.MEDIUM).format(d);
		System.out.println("Current Date Only(Medium):"+dformat);
		dformat=DateFormat.getTimeInstance(DateFormat.SHORT).format(d);
		System.out.println("Current Date Only(Short):"+dformat);
		
		//only DateTime value
		dformat=DateFormat.getDateTimeInstance().format(d);
		System.out.println("Current Date Only: "+dformat);
		dformat=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(d);
		System.out.println("Current Date Only(Long):"+dformat);
		dformat=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM).format(d);
		System.out.println("Current Date Only(Medium):"+dformat);
		dformat=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT).format(d);
		System.out.println("Current Date Only(Short):"+dformat);
	}

}
