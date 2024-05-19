package conversion;

public class unboxing {

	public static void main(String[] args) {
		Boolean obj_b=new Boolean(true);//under version 8
		Boolean objb=true;
		Character obj_c=new Character('a');
		Byte obj_b1=new Byte("45");
		Short obj_s=new Short("456");
		Integer obj_i=new Integer("45678");
		Long obj_l=new Long("3334646");
		Float obj_f=new Float("78.90");
		Double obj_d=new Double("4634645.890");
		
		boolean b=obj_b.booleanValue();//under 8 version
		char c=obj_c;
		byte bb=obj_b1;
		short s=obj_s;
		int i=obj_i;
		long l=obj_l;
		float f=obj_f;
		double d=obj_d;
		
		System.out.println(obj_b);
	}

}
