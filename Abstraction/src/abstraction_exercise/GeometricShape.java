package abstraction_exercise;

public abstract class GeometricShape {

	private String color="red";
	
	public GeometricShape() {
		
	}
	
	public GeometricShape(String c) {
			this.color=c;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void calculateArea();
	public abstract void showInfo();
}
