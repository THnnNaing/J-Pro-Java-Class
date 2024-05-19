package abstraction_eg;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
//		Employee e = new Employee(); //can't create own object 
		
//		Employee e[]=new Employee [3];
//		e[0]=new Manager("1","ThiHan","Mangaing");
//		e[1]=new SalePerson("2","XiaoLiou","Marketing");
//		e[2]=new Labour("3","LiXiao","Cleaner");
//		
////		System.out.println("ID\tName\tDeptName");
////		for(Employee e1:e) {//for each loop
////			System.out.println(e1.getId()+"\t"+e1.getName()+"\t"+e1.getDepName());
////		}	
//		
//		System.out.println(String.format("%-10s %-20s %-20s %-20s %-20s","ID","Name","Department Name","Position","Salary"));
//		for(Employee e1:e) {
//			System.out.print(String.format("%-10s %-20s %-21s",e1.getId(),e1.getName(),e1.getDepName()));
//			if(e1 instanceof Manager) System.out.print(String.format("%-21s", "Manager"));
//			else if(e1 instanceof SalePerson) System.out.print(String.format("%-21s", "Sale Person"));
//			else System.out.print(String.format("%-21s", "Labour"));
//			System.out.println(e1.calculateSalary());
//		}
		
		EISSystem e = new EISSystem(3);
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
			e.EIS();
			System.out.println("Continue or not (y|n) ?:");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}

}
