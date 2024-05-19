package methodoverloadinig;

public class Adder {
	
	//different no. of parameters
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int add(int a[]) {
		int ans=0;
		for(int i=0;i<a.length;i++)
			ans+=a[i];
		return ans;
	}
	
// 	change datatype
	public static double add(double a, double b) {
		return a+b;
	}
	
	public static String add(String a, String b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		int a[]= {5,6,7,8,9,10};
		System.out.println(Adder.add(45,50));
		System.out.println(Adder.add(0.20,0.22));
		System.out.println(Adder.add("Hello","World"));
		System.out.println(Adder.add(45,30,20));
		System.out.println(Adder.add(a));
	}
	
}
