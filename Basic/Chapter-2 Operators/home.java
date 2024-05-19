import	java.util.Scanner;
class Calculate{

	// Celscius to Farhenheit 

	// public static void main(String[] args) {
	// 	int cel;
	// 	double f;
	// 	Scanner sc= new Scanner(System.in);

	// 	System.out.print("Enter a Celsius Degree :");
	// 	cel=sc.nextInt();

	// Don't need to declare DOUBLE if you use INT like below
	// 	f= (int)(1.8 * cel) + 32;

	// 	System.out.println("Fahrenheit Degree :"+f);
	// }
////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Farhenheit to Celscius

		// public static void main(String[] args) {
		// double f;
		// double c;
		// Scanner sc= new Scanner(System.in);

		// System.out.print("Enter a Celsius Degree :");
		// f= sc.nextDouble();

		// c= (f - 32) * (5 / 9.0);

		// System.out.println("Fahrenheit Degree :"+f);

		// Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter temperature in Fahrenheit: ");
        // double fahrenheit = scanner.nextDouble();

        
        // double celsius = (fahrenheit - 32) * 5 / 9;
        // System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.\n", fahrenheit, celsius);
	// }
////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Length of a rectangle

	// public static void main(String[] args) {
	// 	float l, w, a;
	// 	Scanner sc= new Scanner(System.in);

	// 	System.out.print("Enter Length :");
	// 	l=sc.nextInt();

	// 	System.out.print("Enter Width :");
	// 	w=sc.nextInt();

	// 	a= l * w;

	// 	System.out.println("Area  :"+a);
	// }
////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Area of a Circle

	public static void main(String[] args) {
		double b, h, a;
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter Base :");
		b=sc.nextDouble();

		System.out.print("Enter Height :");
		h=sc.nextInt();

		a= 0.5 * b * h;

		System.out.println("Area  :"+a);
	}
}