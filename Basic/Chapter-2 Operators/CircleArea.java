// CircleArea.java
import java.util.Scanner;
class CircleArea{
	public static void main(String[] args) {
		// area = PI r^2;
		final double PI = 3.142; //final -> can't change the value
		double radius, area;
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter a radius for a Circle : ");
		radius=sc.nextDouble();

		area=  PI * radius * radius;

		System.out.println("Area of the Circle : "+area);
	}
}

// Homework Page 11 practice question 2 3, Page 14 exercise 1234 