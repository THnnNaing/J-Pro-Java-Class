package employee;

import java.util.Iterator;

public class DepartmentA {

	public static void main(String[] args) {
		Employee emp[]=new Employee [10];
		for (int i = 0; i < emp.length; i++) {
			emp[i]=new Employee();
			emp[i].inputEmployee();	
		}
		for (int i = 0; i < emp.length; i++) {
            emp[i].showEmployee();
        }
	}
}
