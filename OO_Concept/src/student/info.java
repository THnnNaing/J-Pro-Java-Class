package student;

import java.util.Scanner;

public class info {
	private String rno,name,dob,major;
	
	//constructor
		public info () {
			rno="";
			name="";
			dob="";
			major="";
		}
		//argument constructor
		public info (String no, String n, String m, String d) {
			no=rno;
			n=name;
			m=major;
			d=dob;
		}
		//setter getter
		public String getRno() {
			return rno;
		}
		public void setRno(String rno) {
			this.rno = rno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getMajor() {
			return major;
		}
		public void setMajor(String major) {
			this.major = major;
		}
		public void InputStudent() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student Data (Rno, Name, DoB and Major in order)");
			rno=sc.next();
			name=sc.next();
			dob=sc.next();
			major=sc.next();
		}
		public void showStudent(int n) {
			System.out.println(String.format("%10s %13s %15s %15s",n,name,dob,major));
		}
		
		public static void showHeading() {
			System.out.println(String.format("%10s %13s %15s %15s","Roll No.","Name","DoB","Major"));
		}
		
}
