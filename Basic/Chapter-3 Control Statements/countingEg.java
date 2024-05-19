// Accept 10 numbers from user, display how many positive, negative and zero in user input.
// Accept 10 numbers from userr and find Smallest and Largest numbers.
import java.util.Scanner;
class MaxMinV1{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int positive, negative, zero, num;

		System.out.print("Enter a number :");
		num = sc.nextInt();
		positive=0;
		negative=0;
		zero=0;

		for (int i=1; i<=10; i++) {
			System.out.print("Enter next number : ");
			num = sc.nextInt();
		if (num>0) 
			positive ++;
		else if(num<0)
			negative ++;
		else if (num==0)
			zero ++;
		}
		System.out.println("Positive count : "+positive);
		System.out.println("Negative count : "+negative);
		System.out.println("Zero count : "+zero);
	}
}
