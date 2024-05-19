package conversion;

public class PrimitiveToString {

	public static void main(String[] args) {
		boolean b = true;
		char c='a';
		byte b1=34;
		short s=456;
		int i=7890;
		long l=45678;
		float f=45.89f;
		double d=345.99;
		
		String s_b=String.valueOf(b);
		String s_c=String.valueOf(c);
		String s_bb=String.valueOf(b1);
		String s_s=String.valueOf(s);
		String s_i=String.valueOf(i);
		String s_l=String.valueOf(l);
		String s_f=String.valueOf(f);
		String s_d=String.valueOf(d);
	}

}
