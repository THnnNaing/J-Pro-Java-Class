package employee;
import java.util.Scanner;
public class Employee {
// 	employee data
	private int age,rate;
	private String fn,id,dcode;
	
	// constructor
	public Employee () {
		age=0;
		rate=0;
		fn="";
		id="";
		dcode="";
	}
	
//	arguments constructor
	public Employee (int age, int rate, String fn, String id, String dcode) {
		this.age=age;
		this.rate=rate;
		this.fn=fn;
		this.id=id;
		this.dcode=dcode;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDcode() {
		return dcode;
	}

	public void setDcode(String dcode) {
		this.dcode = dcode;
	}
	
	public void inputEmployee () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter ID, Name, Age, DepartmentCode and SalaryRate: ");
		id=sc.next();
		fn=sc.next();
		age=sc.nextInt();
		dcode=sc.next();
		rate=sc.nextInt();
	}
	
	public void showEmployee () {
		System.out.println(id+":"+fn+":"+age+":"+dcode+":"+rate);
	}
	
	public static void main(String[] args) {
	    Employee e = new Employee();
	    e.inputEmployee();
	    double workingHour, salary, overTimePay;

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Working Hours : ");
	    workingHour = sc.nextDouble();

	    int rate = e.getRate(); // Get the rate from the Employee object

	    if (workingHour <= 40) {
	        salary = workingHour * rate;
	    } else {
	        salary = 40 * rate;
	        double overTime = workingHour - 40;
	        overTimePay = overTime * (rate * 0.3);
	        salary += overTimePay;
	    }
	    
	    e.showEmployee();
	    System.out.println("The Salary : " + salary);
	}
}
