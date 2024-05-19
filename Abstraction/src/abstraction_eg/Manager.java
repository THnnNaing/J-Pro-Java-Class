package abstraction_eg;
import java.util.Scanner;

public class Manager extends Employee {
	
	private int noOfProject;
	private int bonus;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String name, String dName) {
		super(id, name, dName);
		// TODO Auto-generated constructor stub
	}
	
	public Manager(String id, String name, String dName, int p, int b) {
		super(id, name, dName);
		// TODO Auto-generated constructor stub
		noOfProject=p;
		bonus=b;
	}

	@Override
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of project:");
		noOfProject=sc.nextInt();
		System.out.println("Enter bonus for this month:");
		bonus=sc.nextInt();
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return getSalary()+(noOfProject*bonus);
	}
}
