package interface_eg;

public class Student {
	private String rno;
	private String name;
	private String major;
	
	public Student () {}
	
	public Student(String rno, String name, String major) {
		this.rno=rno;
		this.name=name;
		this.major=major;
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	
	
}
