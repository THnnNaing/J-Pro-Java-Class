package finalkeyword;

public class FinalVariable {

	public static void main(String[] args) {
		final int a=10;
		a=20;// error because it is final variable, after updating, it can't change.
	}
	
}
