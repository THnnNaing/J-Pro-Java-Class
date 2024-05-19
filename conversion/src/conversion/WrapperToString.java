package conversion;

public class WrapperToString {

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
		
		String s_b=Boolean.toString(obj_b);
		String s_c=Character.toString(obj_c);
		String s_bb=Byte.toString(obj_b1);
		String s_s=Short.toString(obj_s);
		String s_i=Integer.toString(obj_i);
		String s_l=Long.toString(obj_l);
		String s_f=Float.toString(obj_f);
		String s_d=Double.toString(obj_d);
	}

}
