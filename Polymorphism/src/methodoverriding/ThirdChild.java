package methodoverriding;

public class ThirdChild extends Parent{
	public void display() {
		super.display();//call parent method
		System.out.println("I am inheritance from parent class and also a third child");
	}
}
