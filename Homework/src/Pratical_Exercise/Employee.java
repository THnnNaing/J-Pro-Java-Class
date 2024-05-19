package Pratical_Exercise;

public class Employee extends Person {
	
	private String id;
	private String depCode;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String n, String d) {
		super(n, d);
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String n, String d, String id, String depCode) {
		super(n, d);
		this.depCode=depCode;
		this.id=id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepCode() {
		return depCode;
	}

	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}
	
	public void showEmployee() {
		Employee e = new Employee ("ThiHan","10.9.2004","English","A-0001");
		
		System.out.println("Employee");
		System.out.println("Name:"+e.getName());
		System.out.println("Date of Birth:"+e.getDob());
		System.out.println("DepCode:"+e.getDepCode());
		System.out.println("ID:"+e.getId());
	}

}
