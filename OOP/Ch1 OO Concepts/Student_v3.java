import java.util.Scanner;
class student{
	//member data
	String rno;
	String name;
	int age;
	String major;

	//member functions
	void setStudent(String no, String name, int age, String mj){
		rno = no;
		this.name = name; // same name, this means -> Student
		this.age = age; // same age, this means -> Student
		major = mj;
	}

	void inputStudent(){
		Scanner sc = new Scanner(System.in);
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

	void showStudent(){
		System.out.println("Student Information");
		System.out.println("........................");
		System.out.println("Roll No :"+rno);
		System.out.println("Name \t:"+name);
		System.out.println("Age \t:"+age);
		System.out.println("Major \t:"+major);
		System.out.println("........................");
	}

	public static void main(String[] args) {
		student s1= new student();
		student s2= new student();

		s1.setStudent("IP-0001","Julius",30,"SE");
		s2.inputStudent();

		s1.showStudent();
		s2.showStudent();
	}
}