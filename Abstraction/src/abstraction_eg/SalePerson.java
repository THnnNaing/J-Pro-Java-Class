package abstraction_eg;
import java.util.Scanner;

public class SalePerson extends Employee {
	
	private int com;//commission
	

	public SalePerson() {
		// TODO Auto-generated constructor stub
	}

	public SalePerson(String id, String name, String dName) {
		super(id, name, dName);
		// TODO Auto-generated constructor stub
	}
	
	public SalePerson(String id, String name, String dName, int c) {
		super(id, name, dName);
		// TODO Auto-generated constructor stub
		com=c;
	}

	@Override
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter comission rate:");
		com=sc.nextInt();
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return getSalary()+com;
	}

}
