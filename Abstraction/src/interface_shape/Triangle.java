package interface_shape;

public class Triangle implements Shape {
	private double base;
	private double height;
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}
	
	public Triangle() {}
	public Triangle(double b, double h) {
		base=b;
		height=h;
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
	public void display() {
		System.out.println("Triangle");
		System.out.println("Base : "+base);
		System.out.println("Length : "+height);
	}
	
	
}
