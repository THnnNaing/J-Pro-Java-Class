package AbstractEmployee;

public abstract class Employee implements Payable {
	private String firstName;
	private String secondName;
	private String socialSecurityNumber;
	
	public Employee() {
		
	}
	
	public  Employee(String fn, String sn, String SSN) {
		this.firstName=fn;
		this.secondName=sn;
		this.socialSecurityNumber=SSN;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public abstract double getPaymentAmount();
	
}
