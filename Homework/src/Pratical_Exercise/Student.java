package Pratical_Exercise;

public class Student extends Person {

	private String major;
	private String std_ID;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String n, String d) {
		super(n, d);
		// TODO Auto-generated constructor stub
	}

	public Student(String n, String d, String m, String id) {
		super(n, d);
		this.major=m;
		this.std_ID=id;
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getStd_ID() {
		return std_ID;
	}

	public void setStd_ID(String std_ID) {
		this.std_ID = std_ID;
	}

	public void showStudent() {
		Student s = new Student ("ThiHan","10.9.2004","English","A-0001");
		
		System.out.println("Student");
		System.out.println("Name:"+s.getName());
		System.out.println("Date of Birth:"+s.getDob());
		System.out.println("Major:"+s.getMajor());
	}

}
