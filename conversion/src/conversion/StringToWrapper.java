package conversion;

public class StringToWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s_b="True";
		String s_c="a";
		String s_bb="45";
		String s_s="567";
		String s_i="5678";
		String s_l="90789";
		String s_f="779.08";
		String s_d="456789789.45678";
		
		Boolean obj_b=Boolean.valueOf(s_b);
		Character obj_c=Character.valueOf(s_c.charAt(0));
		Byte obj_bb=Byte.valueOf(s_bb);
		Short obj_s=Short.valueOf(s_s);
		Integer obj_i=Integer.valueOf(s_i);
		Long obj_l=Long.valueOf(s_l);
		Float obj_f=Float.valueOf(s_f);
		Double obj_d=Double.valueOf(s_d);
	}

}
