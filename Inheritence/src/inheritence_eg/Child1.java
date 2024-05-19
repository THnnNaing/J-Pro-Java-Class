package inheritence_eg;

public class Child1 extends Parent{
	
	public int add(int c) {
//		return c+a; //a is private, it only used by Parent
		return c+b; //b is protected, it can be used by Parent and its child
	}
}
