package multilevel_inheritance;

public class FE extends ITStudent {
	private String projectName;
	private String phpAssName;
	
	public FE() {
		// TODO Auto-generated constructor stub
	}

	public FE(String rno, String name, String gender, String m) {
		super(rno, name, gender, m);
		// TODO Auto-generated constructor stub
	}

	public FE(String rno, String name, String gender, String m, String subNames) {
		super(rno, name, gender, m, subNames);
		// TODO Auto-generated constructor stub
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getPhpAssName() {
		return phpAssName;
	}

	public void setPhpAssName(String phpAssName) {
		this.phpAssName = phpAssName;
	}
	
	

}
