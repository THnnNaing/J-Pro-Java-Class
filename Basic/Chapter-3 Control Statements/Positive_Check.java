import	java.util.Scanner;
class Positive_Check_v1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;

		System.out.print("Enter a number: ");
		num=sc.nextInt();

		if (num>=0) {
			System.out.println("It is positive number");
		}
	}
}