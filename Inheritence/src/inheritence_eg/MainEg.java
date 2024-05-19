package inheritence_eg;

public class MainEg {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.setA(20);
		System.out.println("Parent a value : "+p.getA());
//		p.add(30); //Parent used child method -> error
		
		//Inheritance from the child class so we can use the functions from child class
		Child1 c1 = new Child1();
		c1.setA(20);
		System.out.println("Child1 a value : "+c1.getA());
		c1.setB(20);
		System.out.println("Child1 add function reslut : "+c1.add(30));
	}
	
}
