import java.util.Scanner;
class showmonth{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

		System.out.print("Enter a number between 1 and 12 inclusive :");
		num = sc.nextInt();

		if (num<1 || num>12) System.out.println("Wrong input range");
		else System.out.println("Your input month is "+month[num-1]);
	}
}