package personaddress;

import Pratical_Exercise.Person;

public class Address extends Person {
	
	private String add_Line;
	private String city;
	private String state;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String n, String d) {
		super(n, d);
		// TODO Auto-generated constructor stub
	}
	
	public Address(String n, String d, String line, String c, String s) {
		super(n, d);
		this.add_Line=line;
		this.city=c;
		this.state=s;
	}

	public String getAdd_Line() {
		return add_Line;
	}

	public void setAdd_Line(String add_Line) {
		this.add_Line = add_Line;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void showAddress() {
		Address a = new Address("ThiHanNaing","10/9/2004","MKyiStreet","Sanchaung","Yangon");
		
		System.out.println("Address");
		System.out.println("Name:"+a.getName());
		System.out.println("DateOfBirth:"+a.getDob());
		System.out.println("Street:"+a.getAdd_Line());
		System.out.println("City:"+a.getCity());
		System.out.println("State:"+a.getState());
	}
	
	
}
