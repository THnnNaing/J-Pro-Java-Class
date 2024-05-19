package AbstractEmployee;

public class HourlyEmployee extends Employee {

	private double wage;
	private double hours;
	
	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(String fn, String sn, String SSN) {
		super(fn, sn, SSN);
		// TODO Auto-generated constructor stub
	}
	
	public HourlyEmployee(String fn, String sn, String SSN, Double w, Double h) {
		super(fn, sn, SSN);
		this.hours=h;
		this.wage=w;
		// TODO Auto-generated constructor stub
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return  wage * hours;
	}



}
