package finalkeyword;

public class FinalMethodChild extends FinalMethodParent {
	public void welMsg() {//override the parent method
		System.out.println("Welcome from the World");
	}
	
	public void endMsg() { //this is final method, can't override
		System.out.println("Bye Bye");
	}
}
