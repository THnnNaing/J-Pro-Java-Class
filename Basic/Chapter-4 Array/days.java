import java.util.Scanner;
class showday{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String day[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

		System.out.print("Enter a number between 1 and 7 inclusive :");
		num=sc.nextInt();

		if (num<1 || num>7) System.out.println("Wrong input range");
		else System.out.println("Your input day is "+day[num-1]);
	}
}
