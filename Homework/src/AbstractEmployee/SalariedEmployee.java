package AbstractEmployee;

public class SalariedEmployee extends Employee {
	
	private double weeklySalary;

	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(String fn, String sn, String SSN) {
		super(fn, sn, SSN);
		// TODO Auto-generated constructor stub
	}
	
	public SalariedEmployee(String fn, String sn, String SSN, Double ws) {
		super(fn, sn, SSN);
		this.weeklySalary=ws;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return weeklySalary * 4;
	}


}
