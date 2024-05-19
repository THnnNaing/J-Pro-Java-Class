package Exercise2;

public class mainEmployee {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.showEmployee();
		
		System.out.println();
		
		Programmer p = new Programmer();
		p.showProgrammer();
		
		System.out.println();
		
		Scientist s = new Scientist();
		s.showScientist();
	}

}
