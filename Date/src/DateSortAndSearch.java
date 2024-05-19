import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateSortAndSearch {

	public static void main(String[] args) throws ParseException {
		Date d[]=new Date[5];
		String date;
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat dFormat=new SimpleDateFormat("dd-mm-yyyy");//convert string to date
		
		//input 10date
		for(int i=0;i<d.length;i++) {
			System.out.println("Enter date (dd-mm-yyyy):");
			date=sc.next();
			d[i]=dFormat.parse(date);//date<-string
		}
		
		Date temp;
		//sort date value ascending
		for(int i=0;i<d.length-1;i++) {
			for(int j=0;j<d.length;j++) {
				if(d[i].after(d.clone()[j])){
					temp=d[i];
					d[i]=d[j];
					d[j]=temp;
				}
			}
		}
		
		//display of ascending date
		for(Date dd:d) {
			System.out.println(dd);
		}
		
		System.out.println("Enter search by month:");
		int month=sc.nextInt();	
		for(int i=0;i<d.length;i++) {
			if(d[i].getMonth()==month)
				System.out.println(d[i]);
		}
	}

}
