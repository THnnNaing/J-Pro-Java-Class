package abstraction_exercise;
//import java.util.Scanner;

public class Circle extends GeometricShape {
	private double radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(String c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	public Circle(String c, Double r) {
		super(c);
		this.radius=r;
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
