package Pratical_Exercise;

public class Person {

	private String name;
	private String dob;
	
	public Person() {
		
	}
	
	public Person(String n, String d) {
		this.name=n;
		this.dob=d;
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
	
	

}
