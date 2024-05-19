package interface_eg;

public class InterStudent extends Student implements Employee {

	private String depName;
	private String empid;
	
	public InterStudent() {
		// TODO Auto-generated constructor stub
	}

	public InterStudent(String rno, String name, String major) {
		super(rno, name, major);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return basicSalary+50000;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	
}
