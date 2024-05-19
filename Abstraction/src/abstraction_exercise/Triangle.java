package abstraction_exercise;

public class Triangle extends GeometricShape {
	
	private double base;
	private double height;

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(String c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(String c, Double b, Double h) {
		super(c);
		this.base=b;
		this.height=h;
		// TODO Auto-generated constructor stub
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
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
