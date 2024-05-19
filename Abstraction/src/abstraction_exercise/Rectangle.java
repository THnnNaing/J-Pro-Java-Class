package abstraction_exercise;

public class Rectangle extends GeometricShape {
	
	private double length;
	private double width;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(String c, Double l, Double w) {
		super(c);
		this.length=l;
		this.width=w;
		// TODO Auto-generated constructor stub
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
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
