package pos;
import java.util.Scanner;

public class PointOfSale {

	private Item product[]=new Item[20]; //array declaration
	private int productCount = 0; //to count the number of products
	
	public static void starLine(int n, char ch) {// class method 
		for (int i = 1; i <= n; i++) {
			System.out.print(ch);	
		}
		System.out.println();
	}
	
	public void menu () {
		starLine(40,'-');
		System.out.println("Point of Sale System");
		starLine(40,'-');
		System.out.println("1. Add new product");
		System.out.println("2. Show all products");
		System.out.println("3. Exit");
		starLine(40,'-');
		System.out.println("Choose (1-3):");
	}
	
	public void showAllProduct() {
		new Item().showHeading();
		for(int i=0;i<productCount;i++) {
			product[i].showItem(i+1);
		}
	}
	
	public void addNewProduct() {
		if (productCount>20) {
			System.out.println("Already 20 Prodcuts");
		}
		else {
			product[productCount]=new Item();//object creation
			product[productCount].inputItem();
			productCount++;
		}
	}
	
	public void POSSystem () {
		Scanner sc = new Scanner(System.in);
		int option;
		menu();
		option=sc.nextInt();
		switch(option) {
		case 1:
		{
			char ch='y';
			while(ch=='y'||ch=='Y') {
				System.out.println();
				addNewProduct();
				System.out.println("Continue to add next item (y|n)");
				ch=sc.next().charAt(0);
			}
			
		}break;
			
		case 2:showAllProduct();break;
		case 3:;break;
		default:System.out.println("Wrong option");
		}
	}
	
	public static void main(String[] args) {
		PointOfSale pos = new PointOfSale();
		char choice;
		Scanner sc = new Scanner(System.in);
		do {
			pos.POSSystem();
			System.out.println("Go to Main Menu (y?n):");
			choice=sc.next().charAt(0);
		}
		while(choice=='y'||choice=='Y');
	}

}
