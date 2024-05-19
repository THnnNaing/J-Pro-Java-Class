package AbstractEmployee;

public class CommissionEmployee extends Employee {

	private double grossSale;
	private double commissionRate;
	
	public CommissionEmployee() {
		// TODO Auto-generated constructor stub
	}

	public CommissionEmployee(String fn, String sn, String SSN) {
		super(fn, sn, SSN);
		// TODO Auto-generated constructor stub
	}
	
	public CommissionEmployee(String fn, String sn, String SSN, Double gs, Double cr) {
		super(fn, sn, SSN);
		this.commissionRate=cr;
		this.grossSale=gs;
		// TODO Auto-generated constructor stub
	}

	public double getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(double grossSale) {
		this.grossSale = grossSale;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return  grossSale * commissionRate / 100;
	}





}
