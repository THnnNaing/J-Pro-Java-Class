package abstraction_eg;

public class Labour extends Employee {

	public Labour() {
		// TODO Auto-generated constructor stub
	}

	public Labour(String id, String name, String dName) {
		super(id, name, dName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getData() {
		System.out.println("No more data needed to get");
	}
	
	@Override
	public double calculateSalary() {
		return getSalary()+5000;		
	}

}
