package employee;

public class Department {
	private String deptCode;
	private String depName;
	private String description;
	private int currentSize=0; //count the number of employee in department
	private Employee emp[]; //Employee emp[]=new Employpeee[30];
	
	public Department(int noOfEmp) {
		emp=new Employee[noOfEmp];
	}
	
	public Department(int noOfEmp, String code, String name) {
		emp=new Employee[noOfEmp];
		deptCode=code;
		depName=name;
	}
	public void addEmployee(Employee e) {
//		check for full or not
		if (currentSize>=emp.length)
			System.out.println("Full of employee");
		else {
			emp[currentSize]=e;
			currentSize++;
//			or
//			emp[currentSize++]=e
			System.out.println("Save Successfully");
		}
	}
	public void showAllEmployee() {
		System.out.println("Department Name :"+depName);
		System.out.println("Department Code :"+deptCode);
		System.out.println("Number of Employee :"+(currentSize));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("No.\tEmpID\tName\t\tSalaryRate");
		System.out.println("-----------------------------------------------------------------");
		for (int i = 0; i < currentSize; i++) {
			System.out.println((i+1)+"\t"+emp[i].getId()+"\t"+emp[i].getFn()+"\t\t"+emp[i].getRate());
		}
	}
}

