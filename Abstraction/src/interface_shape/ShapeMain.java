package interface_shape;

public class ShapeMain {

	public static void main(String[] args) {
		Shape s[] = new Shape[5];
		s[1] = new Triangle(4,5);
		s[2] = new Rectangle(45,56);
		s[3] = new Circle(6);
		s[4] = new Triangle(4,6);
		s[0] = new Rectangle(6,7);
		
		for(int i=0; i < s.length; i++)
			System.out.println("Area"+s[i].calculateArea());
	}

}
