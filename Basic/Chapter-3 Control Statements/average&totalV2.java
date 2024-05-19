// accept numbers until user enter negative values, find the total and average
import java.util.Scanner;
class calc{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n,c;
		double a, t; 
		t=0;
		System.out.print("enter a number (exit for negative value) :");
		n = sc.nextInt();
		while(n>=0){
			t += n;
			c++
			System.out.print("enter next number (exit for negative value) : ");
			n=sc.nextInt();
		}
		a=t/(count*1.0); // *1.0 for output double value
		System.out.println("total"+t);
		System.out.println("average"+a);
	}
}