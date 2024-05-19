import java.util.Scanner;
class calc{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n;
		double a, t; 
		t =0;
		for (int i=0; i<=10; i++) {
			System.out.print("Enter a number");
			n = sc.nextInt();
			t =+ n;
		}
			a = t/10.0;
			System.out.println("total"+t);
			System.out.println("average"+a);
	}
}