package time; //creating package time
import java.util.Scanner;
public class time {
// member data
	private int h,m,s;
	
// Constructor
	public time () {
		h=0;
		m=0;
		s=0;
	}
	
//	three arguments constructor
	public time (int h, int m, int s) {
		this.h=h;
		this.m=m;
		this.s=s;
	}
	
//	one arguments constructor
	public time (int tots) {
		h=tots/3600;
		tots%=3600;
		m=tots/60;
		s=tots%60;
	}
	
// member functions 
	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	} 
	
	public void inputTime () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter hour, minute and second : ");
		h=sc.nextInt();
		m=sc.nextInt();
		s=sc.nextInt();
	}
	
	public void showTime () {
		System.out.println(h+":"+m+":"+s);
	}
	
	public int time_To_tots() {
		return s+m*60+h*3600;
	}
	
	public time addTime(time t1, time t2) {
		time t3=new time();
		t3.h = t1.h + t2.h;
		t3.m = t1.m + t2.m;
		t3.s = t1.s + t2.s;
		
		if(t3.s>=60) {
			t3.m+= t3.s/60; //t3.m++;
			t3.s%=60;
		}
		
		if(t3.m>=60) {
			t3.h+= t3.m/60; //t3.h++;
			t3.m%=60;
		}
		return t3;
	}
	
	 public time addTime(time t) {
		 h += t.h;
		 m += t.m;
		 s += t.s;
		 
		 if(s>=60) {
			 m++;
			 s%=60;
		 }
		 
		 if(m>=60) {
			 h++;
			 m%=60;
		 }
		 return new time(h,m,s);
	 }
	
}
