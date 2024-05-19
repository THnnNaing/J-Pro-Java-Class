// Accept 10 numbers from userr and find Smallest and Largest numbers.
import java.util.Scanner;
class MaxMinV1{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int max, min, num;

		System.out.print("Enter a number :");
		num = sc.nextInt();
		max=num;
		min=num;

		for (int i=1; i<=9; i++) {
			System.out.print("Enter next number : ");
			num = sc.nextInt();
		if (num>max) 
			max = num;
		else if(num<min)
			min = num;
		}
		System.out.println("Maximum number is : "+max);
		System.out.println("Minimum number is : "+min);
	}
}