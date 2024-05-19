package hierarchical_inheritance;

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
	
}
