//using member functions
import java.util.Scanner;
class Student{
	//member data
	String rno;
	String name;
	int age; 
	String major;
	//member functions

	void setStudent(String no, String n, int a, String m){
		rno = no;
		name = n;
		age = a;
		major = m;
	}

	void inputStudent(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Student Information : ");
		System.out.println();
		System.out.print("Roll No -> ");
		rno=sc.next();
		System.out.print("Name    -> ");
		name=sc.next();
		System.out.print("Age     -> ");
		age=sc.nextInt();
		System.out.print("Major   -> ");
		major=sc.next();
	}

	public static void main(String[] args) {
		Student s1=new Student(); //object creation
		Student s2=new Student(); //object creation

		s1.setStudent("JPRO-IP-0001","Aung Aung",20,"IP");

		// s1.rno="JPRO-IP-0001";
		// s1.name="Aung Aung";
		// s1.age=20;
		// s1.major="IP";

		Scanner sc = new Scanner (System.in);
		// s2.rno="JPRO-IP-0002";
		// s2.name="Mya Mya";
		System.out.println("Enter Age and Major : ");
		int age=sc.nextInt();
		String major=sc.next();
		s2.setStudent("JPRO-IP-0002","Mya Mya",age,major);

		Student s3= new Student();
		s3.inputStudent();
	}
}
