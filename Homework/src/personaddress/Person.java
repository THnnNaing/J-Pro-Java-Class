package personaddress;

public class Person {
	private String name;
	private String dob;
	private Address add = new Address();
	
	public  Person() {
		
	}
	
	public Person(String n, String d, Address a) {
		this.name=n;
		this.dob=d;
		this.add=a;
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

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
	public void showinfo() {
		new Address().showAddress();
		System.out.println();
		add.showAddress();
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.showinfo();
	}
}
