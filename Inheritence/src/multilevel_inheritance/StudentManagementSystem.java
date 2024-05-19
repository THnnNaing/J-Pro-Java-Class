package multilevel_inheritance;

import java.util.Scanner;

public class StudentManagementSystem {

//	IP,FE
//	IP ip[]; // declare if variable
// 	ip=new IP[67]; // arrary defined
//  ip[1]=new IP(); //object create
	private IP ip[];
	private FE fe[];
	private final int iMax,fMax;
	private int icount=0,fcount=0;
	
	public StudentManagementSystem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maximun number of IP students :");
		iMax=sc.nextInt();
		System.out.println("Enter maximun number of FE students :");
		fMax=sc.nextInt();
		
		//array declaratioin
		ip=new IP[iMax];
		fe=new FE[fMax];
	}
	
	public StudentManagementSystem(int icount, int fcount) {
		iMax=icount;
		fMax=fcount;
		
		ip=new IP[iMax];
		fe=new FE[fMax];
		
//		for (int i = 0; i < icount; i++) {
//			ip[i]=new IP();
//		}
//		
//		for (int i = 0; i < fcount; i++) {
//			fe[i]=new FE();
//		}
	}
	
	public static void starLine(int n, char ch) { 
		for (int i = 1; i <= n; i++) {
			System.out.print(ch);	
		}
		System.out.println();
	}
	
	public void menu () {
		starLine(40,'-');
		System.out.println("Student Information System");
		starLine(40,'-');
		System.out.println("1. Add new IP student");
		System.out.println("2. Add new FE student");
		System.out.println("3. Exit");
		starLine(40,'-');
		System.out.println("Choose (1-3):");
	}
	
	public void addNewIPStudent() {
		if(icount>iMax) System.out.println("Full of IP Students");
		else {
			Scanner sc = new Scanner(System.in);
			ip[icount]=new IP();
			ip[icount].getStudent("IT-IP");
			System.out.println("Enterr Subject Names(using-):");
//			String sname=sc.next();
//			ip[icount].setSubNames(sname);
			ip[icount].setSubNames(sc.next());
			icount++;
		}
	}
	
	public void addNewFEStudent() {
		if(fcount>iMax) System.out.println("Full of FE Students");
		else {
			Scanner sc = new Scanner(System.in);
			fe[fcount]=new FE();
			fe[fcount].getStudent("IT-FE");
			System.out.println("Enterr Subject Names(using-):");
//			String sname=sc.next();
//			fe[fcount].setSubNames(sname);
			fe[fcount].setSubNames(sc.next());
			fcount++;
		}
	}
	
	public void SMSSystem () {
		Scanner sc = new Scanner(System.in);
		int option;
		menu();
		option=sc.nextInt();
		switch(option) {
		case 1:
		{
			char ch='y';
			while(ch=='y'||ch=='Y') {
				System.out.println();
				addNewIPStudent();
				System.out.println("Continue to next IP Student (y|n)");
				ch=sc.next().charAt(0);
			}
		}break;
			
		case 2:
		{
			char ch='y';
			while(ch=='y'||ch=='Y') {
				System.out.println();
				addNewFEStudent();
				System.out.println("Continue to next FE Student (y|n)");
				ch=sc.next().charAt(0);
			}
		}break;
		case 3:;break;
		default:System.out.println("Wrong option");
		}
	}

}
