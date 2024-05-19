package finalkeyword;

public class FinalMethodParent {
	public void welMsg() {
		System.out.println("Hello World");
	}
	
	public final void endMsg() { //this is final method, can't override
		System.out.println("Bye Bye");
	}
	
}
