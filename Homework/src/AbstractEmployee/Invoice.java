package AbstractEmployee;

public class Invoice implements Payable{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public  Invoice() {
		
	}
	
	public  Invoice(String pn, String pd, int q, Double ppi) {
		this.partNumber=pn;
		this.partDescription=pd;
		this.quantity=q;
		this.pricePerItem=ppi;
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return quantity * pricePerItem;		
	}
	
	
}
