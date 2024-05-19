package AbstractEmployee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary;

	public BasePlusCommissionEmployee() {
		// TODO Auto-generated constructor stub
	}

	public BasePlusCommissionEmployee(String fn, String sn, String SSN) {
		super(fn, sn, SSN);
		// TODO Auto-generated constructor stub
	}

	public BasePlusCommissionEmployee(String fn, String sn, String SSN, Double gs, Double cr) {
		super(fn, sn, SSN, gs, cr);
		// TODO Auto-generated constructor stub
	}
	
	public BasePlusCommissionEmployee(String fn, String sn, String SSN, Double gs, Double cr, Double bs) {
		super(fn, sn, SSN, gs, cr);
		this.setBaseSalary(bs);
		// TODO Auto-generated constructor stub
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	 @Override
	    public double getPaymentAmount() {
	        return super.getPaymentAmount() + baseSalary;
	    }

}
