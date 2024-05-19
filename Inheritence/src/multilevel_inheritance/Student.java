package multilevel_inheritance;

import java.util.Scanner;

public class Student {
	private String rno;
	private String name;
	private String gender;
	private String major;
	
	public Student() {
		
	}
	public Student(String rno, String name, String gender, String m) {
		this.rno=rno;
		this.name=name;
		this.gender=gender;
		major=m;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void getStudent(String m) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Roll No :");
		rno=sc.next();
		System.out.print("Enter Student Name :");
		name=sc.next();
		System.out.print("Enter Student (Male|Female) :");
		gender=sc.next();
		major=m;
	}
	
}
