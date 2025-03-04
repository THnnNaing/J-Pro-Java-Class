package student;
import java.util.Scanner;

import pos.Item;
import pos.PointOfSale;

public class Student {
	
	private int studentCount = 0;
	private info student[]=new info[20];
	
	public static void starLine(int n, char ch) {// class method 
		for (int i = 1; i <= n; i++) {
			System.out.print(ch);	
		}
		System.out.println();
	}
	
	public void menu () {
		starLine(40,'-');
		System.out.println("Student Management System");
		starLine(40,'-');
		System.out.println("1. Add new info");
		System.out.println("2. Show all student info");
		System.out.println("3. Exit");
		starLine(40,'-');
		System.out.println("Choose (1-3):");
	}
	
	public void showAllProduct() {
		new info().showHeading();
		for(int i=0;i<studentCount;i++) {
			student[i].showStudent(i+1);
		}
	}
	
	public void addNewStudent() {
		if (studentCount>20) {
			System.out.println("Already 20 Students");
		}
		else {
			student[studentCount]=new info();//object creation
			student[studentCount].InputStudent();
			studentCount++;
		}
	}
	
	public void StudentSystem () {
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
				addNewStudent();
				System.out.println("Continue to add next info (y|n)");
				ch=sc.next().charAt(0);
			}
			
		}break;
			
		case 2:showAllProduct();break;
		case 3:;break;
		default:System.out.println("Wrong option");
		}
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		char choice;
		Scanner sc = new Scanner(System.in);
		do {
			s.StudentSystem();
			System.out.println("Go to Main Menu (y?n):");
			choice=sc.next().charAt(0);
		}
		while(choice=='y'||choice=='Y');
	}
	
	
}
