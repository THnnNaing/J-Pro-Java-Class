package Exercise2;

public class Scientist extends Employee {
	
	private String research_area;

	public Scientist() {
		// TODO Auto-generated constructor stub
	}

	public Scientist(String id, String name, String dCode) {
		super(id, name, dCode);
		// TODO Auto-generated constructor stub
	}
	public Scientist(String id, String name, String dCode, String rArea) {
		super(id, name, dCode);
		this.research_area=rArea;
	}

	public String getResearch_area() {
		return research_area;
	}

	public void setResearch_area(String research_area) {
		this.research_area = research_area;
	}
	
	public void showScientist() {
		Scientist s = new Scientist ("D-001","Thihan","A-0001","Hokkaido");
		
		System.out.println("Employee");
		System.out.println("ID:"+s.getId());
		System.out.println("Name:"+s.getName());
		System.out.println("DepCode:"+s.getDepCode());
		System.out.println("Research Area"+s.getResearch_area());
	}

}
