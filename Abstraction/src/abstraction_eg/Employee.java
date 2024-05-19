package abstraction_eg;

public abstract class Employee {
	private String id;
	private String name;
	private String depName;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(String id, String name, String dName) {
		this.id=id;
		this.name=name;
		this.depName=dName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//	add new abstract method
	public abstract void getData();
	public abstract double calculateSalary();
	
}
