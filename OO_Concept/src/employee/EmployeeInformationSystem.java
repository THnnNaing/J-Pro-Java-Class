package employee;

import java.util.Scanner;

public class EmployeeInformationSystem {

	public static void starLine(int n, char ch) {// class method 
		for (int i = 1; i <= n; i++) {
			System.out.print(ch);	
		}
		System.out.println();
	}
	
	public static void menu () {
		starLine(40,'-');
		System.out.println("Employee Information System");
		starLine(40,'-');
		System.out.println("1. Add New Employee");
		System.out.println("2. Show All Employee");
		System.out.println("3. Exit");
		starLine(40,'-');
		System.out.println("Choose (1-3):");
	}
	
	public static void welcomeMsg() {
		starLine(50,'-');
		System.out.println("Welcome from Employee Information System");
		starLine(50,'-');
	}
	
	public static void endingMsg() {
		System.out.println("----------------END OF THE PROGRAM----------------");
	}
	
	public static void main(String[] args) {
		welcomeMsg();
		Department d = new Department(20);
		Scanner sc= new Scanner(System.in);
		char ch;
		int opt;
		lbl:
		do {
			menu();
			opt=sc.nextInt();
			switch(opt) {
				case 1:{
					Employee e=new Employee();
					e.inputEmployee();
					d.addEmployee(e);
				};break;
				case 2:d.showAllEmployee();;break;
				case 3:;break lbl;
				default:System.out.println("Wrong Option!");
			}
			System.out.println("Continue to Main or not (y|n)?:");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		endingMsg();
	}
}
