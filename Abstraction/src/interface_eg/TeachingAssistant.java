package interface_eg;

public class TeachingAssistant extends Student implements Employee {

	private String subName;
	
	public TeachingAssistant() {
		// TODO Auto-generated constructor stub
	}

	public TeachingAssistant(String rno, String name, String major) {
		super(rno, name, major);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return basicSalary+100000;
	}

}
