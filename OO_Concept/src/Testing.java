/*
 * keywords & variable
 - static variable
 - final variable
 -insane variable
 */
public class Testing {
	
	private static int a=0; //share by all objects
	private int b;			//instance variable -> own by each object
	private final int c=10; //can't update
	
	public Testing() {
		a++;
		b=10;
	}

//static variable
	public static int getA() {//class method -> new Testing().getA()
		return a;
	}

	public void setA(int a) {// not class method -> Testing t=new Testing(); t.setA(56);
		Testing.a = a;
	}

//instance  variable
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

//final variable -> no set method -> can't update
	public int getC() {
		return c;
	}

	public void showData() {
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
	}
	
	public static void main(String[] args) {
		Testing t1= new Testing();
		System.out.println("For first object");
		t1.showData();
		
		Testing t2= new Testing();
		System.out.println("For second object");
		t2.showData();
		
		t2.setB(34);
		System.out.println("For second object after updating instance to 34");
		t2.showData();
		System.out.println("For first object");
		t1.showData();
		
		new Testing().setA(45);
		System.out.println("For first object after updating static variable");
		t1.showData();
		System.out.println("For second object after updating static variable");
		t2.showData();
	}

}
