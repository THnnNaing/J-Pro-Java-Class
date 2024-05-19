package abstraction_eg;

import java.util.Scanner;

public class EISSystem {
	private Employee e[]; // size -> in constructor
	private final int size; // can't change after setting
	private int currentSize=-1;
	
	public EISSystem(int s) {
		size=s;
		e=new Employee[size];
	}
	
	public void addEmployee(Employee emp) {
		//full
		Scanner sc=new Scanner(System.in);
		if(currentSize >= size-1)System.out.println("Full of Employee");
		else {
			System.out.print("Enter Employee ID:");
			emp.setId(sc.next());
			System.out.print("Enter Employee Name:");
			emp.setDepName(sc.next());
			System.out.print("Enter Department Name:");
			emp.setDepName(sc.next());
			System.out.print("Enter Employee Salary:");
			emp.setSalary(sc.nextInt());
			if(!(emp instanceof Labour))
				emp.getData();//based on each child
			e[++currentSize]=emp;
		}
	}
	
	public void showHeader() {
		System.out.println(String.format("%-10s %-20s %-20s %-20s %-20s","ID","Name","Department Name","Position","Salary"));
	}
	
	public void showAllEmployee() {
		if(currentSize==-1)System.out.println("Empty Data");
		else
			for(int i=0;i<=currentSize;i++) {
				System.out.print(String.format("%-10s %-20s %-21s",e[i].getId(),e[i].getName(),e[i].getDepName()));
				if(e[i] instanceof Manager) System.out.print(String.format("%-21s", "Manager"));
				else if(e[i] instanceof SalePerson) System.out.print(String.format("%-21s", "Sale Person"));
				else System.out.print(String.format("%-21s", "Labour"));
				System.out.println(e[i].calculateSalary());
			}
	}
	
	public static void starLine(int n, char ch) {// class method 
		for (int i = 1; i <= n; i++) {
			System.out.print(ch);	
		}
		System.out.println();
	}
	
	public static void menu () {
		starLine(100,'-');
		System.out.println("Employee Information System");
		starLine(100,'-');
		System.out.println("1. Add New Employee");
		System.out.println("2. Show All Employee");
		System.out.println("3. Exit");
		starLine(100,'-');
		System.out.println("Choose (1-3):");
	}
	
	public static void EmployeeMenu () {
		starLine(50,'-');
		System.out.println("Employee Type");
		starLine(50,'-');
		System.out.println("1. Manager");
		System.out.println("2. SalePerson");
		System.out.println("3. Labour");
		starLine(50,'-');
		System.out.println("Choose (1-3):");
	}
	
	public void EIS() {
		Scanner sc = new Scanner(System.in);
		int opt;
		menu();
		opt=sc.nextInt();
		switch(opt) {
		case 1:{
			int option;
			EmployeeMenu();
			option=sc.nextInt();
			switch(option) {
			case 1:{
				addEmployee(new Manager());
			};break; 						// d kg ka kya {} dr htae tr shin ag loh tk
			case 2:addEmployee(new SalePerson());;break; // ta kyoung htl yay chin loh {} d kg ko phoke tr
			case 3:addEmployee(new Labour());;break;
			default: System.out.println("Wrong option");
			}
		}break;
		case 2:{
			starLine(80,'-');
			showHeader();
			starLine(80,'-');
			showAllEmployee();
			starLine(80,'-');
		};break;
		case 3:System.exit(0);
		default: System.out.println("Wrong option");
		}
	}
}
