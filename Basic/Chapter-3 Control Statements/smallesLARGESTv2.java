// / Accept numbers until enter 0, and find Smallest and Largest numbers.
import java.util.Scanner;
class MaxMinV1{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int max, min, num;

		System.out.print("Enter a number :");
		num = sc.nextInt();
		max=num;
		min=num;

		while(num>0 || num<0){	
			if (num>max) max = num; 
			else if (num>max) max = num; 
			System.out.print("Enter a number :");
			num = sc.nextInt();	
		}

		System.out.println("Maximum number is : "+max);
		System.out.println("Minimum number is : "+min);
	}
}