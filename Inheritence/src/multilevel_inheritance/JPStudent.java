package multilevel_inheritance;

public class JPStudent extends Student {
	
	private String level;
	private String skills;
	
	public JPStudent() {
		// TODO Auto-generated constructor stub
	}

	public JPStudent(String rno, String name, String gender, String m) {
		super(rno, name, gender, m);
		// TODO Auto-generated constructor stub
	}
	
//	own constructor
	public JPStudent(String rno, String name, String gender, String m, String level, String skills) {
		super(rno, name, gender, m);
		this.level=level;
		this.skills=skills;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	
}
