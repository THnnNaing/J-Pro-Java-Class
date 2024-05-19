/*
	name, age, id
	16
	name[], age[], id[]
	for(int i=0; i<17; i++){
		syso("Enter student name : ")
		name[i]=sc.next();
		syso("Enter student age : ")
		age[i]=sc.nextInt();
		syso("Enter student id : ")
		id[i]=sc.next();
	}
*/
import java.util.Scanner;
class Student{
	//member data
	String rno;
	String name;
	int age; 
	String major;
	//member functions

	public static void main(String[] args) {
		Student s1=new Student(); //object creation
		Student s2=new Student(); //object creation

		s1.rno="JPRO-IP-0001";
		s1.name="Aung Aung";
		s1.age=20;
		s1.major="IP";

		Scanner sc = new Scanner (System.in);
		s2.rno="JPRO-IP-0002";
		s2.name="Mya Mya";
		System.out.println("Enter Age and Major : ");
		s2.age=sc.nextInt();
		s2.major=sc.next();
	}
}
