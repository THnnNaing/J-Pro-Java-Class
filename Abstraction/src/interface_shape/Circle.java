package interface_shape;

public class Circle implements Shape {
	private double radious;
	private final double pi=3.14;
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return pi*radious *radious;
	}
	
	public Circle() {}
	public Circle(double r) {
		radious= r;
	}

	@Override
	public void display() {
		System.out.println("Circle");
		System.out.println("Radious"+radious);
	}
	
}
