package Exercise2;

public class Employee {

	private String id;
	private String name;
	private String depCode;
	
	public Employee() {
		
	}
	
	public Employee(String id, String name, String dCode) {
		this.id=id;
		this.name=name;
		this.depCode=dCode;
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
	public String getDepCode() {
		return depCode;
	}
	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}
	
	public void showEmployee() {
		Employee e = new Employee ("D-001","Thihan","A-0001");
		
		System.out.println("Employee");
		System.out.println("ID:"+e.getId());
		System.out.println("Name:"+e.getName());
		System.out.println("DepCode:"+e.getDepCode());
	}
	
	

}
