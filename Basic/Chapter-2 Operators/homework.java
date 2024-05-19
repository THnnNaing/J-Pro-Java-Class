import	java.util.Scanner;
class Calculate{
	public static void main(String[] args) {
		// int num1, num2 ;
		// float quo,redm;
		// Scanner sc= new Scanner(System.in);

		// System.out.print("Enter First Number :");
		// num1=sc.nextInt();
		// System.out.print("Enter First Number :");
		// num2=sc.nextInt();

		// quo=num1/num2;
		// rem=num1%num2;
		// System.out.println("Enter First Number :"+quo);
		// System.out.println("Enter First Number :"+rem);
// ==================================================================
		// Hour to second, minute to second, second and total of them
		// int h, m, s, ts;
		// Scanner sc= new Scanner(System.in);
		// System.out.print("Enter Hour :");
		// h=sc.nextInt();

		// System.out.print("Enter Minute :");
		// m=sc.nextInt();

		// System.out.print("Enter Second :");
		// s=sc.nextInt();

		// ts= (h*3600) + (m*60) + s;
		// System.out.println("Total Second:"+ts);
// ====================================================================
		// Feet to meter

		// double f, m;
		// Scanner sc= new Scanner(System.in);
		// System.out.print("Enter Feet : ");
		// f=sc.nextDouble();

		// m= f*0.3048;
		// System.out.println("Meter Value :"+m);
// ====================================================================
		// float n1,n2,n3, nn1, nn2, nn3, r1, r2, r3, v;
		// Scanner sc= new Scanner(System.in);
		// System.out.print("Enter First Distance in feet :");
		// n1=sc.nextFloat();
		// System.out.print("Enter First Distance in inches :");
		// nn1=sc.nextFloat();

		// System.out.print("Enter Second Distance in feet :");
		// n2=sc.nextFloat();
		// System.out.print("Enter Second Distance in inches :");
		// nn2=sc.nextFloat();

		// System.out.print("Enter Third Distance in feet :");
		// n3=sc.nextFloat();
		// System.out.print("Enter Third Distance in inches :");
		// nn3=sc.nextFloat();

		// r1=n1/12;
		// r2=n2/12;
		// r3=n3/12;

		// v= (r1+nn1) * (r2+nn2) * (r3+nn3);
		// System.out.println("Volume Value :"+v+" cubic inches");


		float intBal, interestRate;
		int years;
		double finalBal;
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter Initial Balance :");
		intBal=sc.nextFloat();

		System.out.print("Enter Number of Years :");
		years=sc.nextInt();

		System.out.print("Enter Number of Interest Rate :");
		interestRate=sc.nextFloat();

		finalBal= intBal * years * interestRate/100;

		System.out.println("Volume Value :"+finalBal);
	}
}

