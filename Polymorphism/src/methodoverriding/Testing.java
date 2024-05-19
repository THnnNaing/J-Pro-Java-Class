package methodoverriding;

public class Testing {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		SecondChild sc=new SecondChild();
		ThirdChild tc=new ThirdChild();
		
		p.display();
		c.display(); //call parent method
		sc.display(); //parent -> display(), own->display(), call its own function
		System.out.println();
		tc.display();
	}

}

