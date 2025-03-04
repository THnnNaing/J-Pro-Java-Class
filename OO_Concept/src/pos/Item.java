package pos;
import java.util.Scanner;
public class Item {
// member data
	private String itemNo;
	private String name;
	private int price;
	private int qty;
	
// constructor
	public Item() {
		itemNo="Item-0000";
		price=0;
		qty=0;
	}
	public Item(String no, String n, int p, int q) {
		itemNo=no;
		name=n;
		price=p;
		qty=q;
	}
	public void inputItem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data for Item.....");
		System.out.println("Item No (eg.Item-0001):");
		itemNo=sc.next();
		System.out.println("Item Name (Without using space):");
		name=sc.next();
		System.out.println("Item Price (whole integer):");
		price=sc.nextInt();
		System.out.println("No. of available quantity:");
		qty=sc.nextInt();
	}
	
// Alt + Shift + S + R => generate setter and getter
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public static void showHeading() {
//		System.out.println(String.format("%10s", "No.")+String.format("%13s", "ItemNo")
//							+String.format("%15s", "Item Name")+String.format("%15s", "Price")
//							+String.format("%15s", "Quantity"));
		System.out.println(String.format("%10s %13s %15s %15s %15s","No.","Item No.","Name","Price","Qty"));
	}
//		s-string  -> %s -> 10%s
//		d-decimal -> %d -> %20d
//		f-float   -> %f -> %20f -> %5.5f
		
	public void showItem(int n) {
		System.out.println(String.format("%10s %13s %15s %15d %15d",n,itemNo,name,price,qty));
	}
	
}
