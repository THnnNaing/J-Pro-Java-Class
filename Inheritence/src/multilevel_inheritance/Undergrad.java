package multilevel_inheritance;

import hierarchical_inheritance.Student;

public class Undergrad extends Student {
	
	private String project_life;

	public Undergrad() {
		// TODO Auto-generated constructor stub
	}

	public Undergrad(String rno, String name, String gender, String m) {
		super(rno, name, gender, m);
		// TODO Auto-generated constructor stub
	}

	public String getProject_life() {
		return project_life;
	}

	public void setProject_life(String project_life) {
		this.project_life = project_life;
	}
	
	

}
