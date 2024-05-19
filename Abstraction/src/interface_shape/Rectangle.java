package interface_shape;

public class Rectangle implements Shape {
	private double width;
	private double length;
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return width*length;
	}
	
	public Rectangle() {}
	
	public Rectangle(double w, double l) {
		width=w;
		length=l;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public void display() {
		System.out.println("Rectangle info");
		System.out.println("Length : "+length);
		System.out.println("Width : "+width);
	}
}
