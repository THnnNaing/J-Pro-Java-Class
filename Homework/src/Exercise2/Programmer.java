package Exercise2;

public class Programmer extends Employee {
	
	private String projectList;

	public Programmer() {
		// TODO Auto-generated constructor stub
	}

	public Programmer(String id, String name, String dCode) {
		super(id, name, dCode);
		// TODO Auto-generated constructor stub
	}
	
	public Programmer(String id, String name, String dCode, String projectList) {
		super(id, name, dCode);
		this.projectList=projectList;
	}

	public String getProjectList() {
		return projectList;
	}

	public void setProjectList(String projectList) {
		this.projectList = projectList;
	}
	
	public void showProgrammer() {
		Programmer p = new Programmer ("D-001","Thihan","A-0001","15");
		
		System.out.println("Employee");
		System.out.println("ID:"+p.getId());
		System.out.println("Name:"+p.getName());
		System.out.println("DepCode:"+p.getDepCode());
		System.out.println("ProjectList:"+p.getProjectList());
	}

}
