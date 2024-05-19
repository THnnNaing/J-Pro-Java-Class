package interface_eg;

public interface Employee {
	public double basicSalary = 200000; // auto->static final->can't changed
	
	public double calculateSalary();// abstract method->no implementation, only declaration
	
}
