// ScannerInput.java
import java.util.Scanner; //we are writing in java.lang. (ak tok utility file htl ka functions twy yu tone tr)
class UserInput_Scanner{
	public static void main(String[] args) {
		int num1, num2, ans;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter First Number :");
		num1=sc.nextInt();
		System.out.print("Enter Second Number : ");
		num2=sc.nextInt();
		ans = num1 + num2;

		System.out.println("Addition Result : "+ans);
	}
}