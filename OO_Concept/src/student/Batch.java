package student;

import employee.Employee;

public class Batch {
	private String batchNo;
	private String batchName;
	private int currentSize=0;
	private info[] stu;
	
	public Batch(int noOfStu, String no, String name) {
		stu=new info[noOfStu];
		batchNo=no;
		batchName=name;
	}
	public void addEmployee(info s) {
//		check for full or not
		if (currentSize>=stu.length)
			System.out.println("Full of employee");
		else {
			stu[currentSize]=s;
			currentSize++;
//			or
//			stu[currentSize++]=e
			System.out.println("Save Successfully");
		}
	}
	public void showAllStudent() {
		System.out.println("Batch Name :"+batchName);
		System.out.println("Batch Number :"+batchNo);
		System.out.println("Number of Student :"+(currentSize));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("No.\tStudentID\tName\t\tDateOfBirths");
		System.out.println("-----------------------------------------------------------------");
		for (int i = 0; i < currentSize; i++) {
			System.out.println((i+1)+"\t"+stu[i].getRno()+"\t"+stu[i].getName()+"\t\t"+stu[i].getDob());
		}
	}
}
