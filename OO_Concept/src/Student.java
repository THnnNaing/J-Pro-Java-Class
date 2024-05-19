
public class Student {
	// member data
	String rno;
	String name;
	int age;
	
	void showData() {
//		syso -> Ctrl + Space
//		comment -> Ctrl + ?
		System.out.println("Rno  : "+rno);
		System.out.println("Name : "+name);
		System.out.println("Age  : "+age);
	}

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		s1.name="Ma Thu Thu";
		s1.age=20;
		s1.rno="JPRO-00001";
		s2.name="Myo Myo";
		s2.age=21;
		s2.rno="JPRO-00002";
		
		s1.showData();
		s2.showData();
	}

}
