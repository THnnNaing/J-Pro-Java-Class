package conversion;

public class autoboxing {
	public static void main(String[] args) {
		boolean b = true;
		char c='a';
		byte b1=34;
		short s=456;
		int i=7890;
		long l=45678;
		float f=45.89f;
		double d=345.99;
		
		Boolean obj_b=Boolean.valueOf(b);//under version 8
		Character obj_c=c;
		Byte obj_b1=b1;
		Short obj_s=s;
		Integer obj_i=i;
		Long obj_l=l;
		Float obj_f=f;
		Double obj_d=d;
		System.out.println(obj_b);
	}
}
