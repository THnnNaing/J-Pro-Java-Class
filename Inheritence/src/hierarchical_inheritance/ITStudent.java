package hierarchical_inheritance;

public class ITStudent extends Student {
	
	private String subNames;

	public ITStudent() {
		super(); // Parent class name's representative = super
	}

	public ITStudent(String rno, String name, String gender, String m) {
		super(rno, name, gender, m);
	}
	
//	own write
	public ITStudent(String rno, String name, String gender, String m, String subNames) {
		super(rno, name, gender, m);
		this.subNames=subNames;
	}

	public String getSubNames() {
		return subNames;
	}

	public void setSubNames(String subNames) {
		this.subNames = subNames;
	}
	
	

}
