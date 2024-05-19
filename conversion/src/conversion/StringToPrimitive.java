package conversion;

public class StringToPrimitive {

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
		
		boolean b=Boolean.parseBoolean(s_b);
		char c=s_c.charAt(0);
		byte bb=Byte.parseByte(s_bb);
		Short s=Short.parseShort(s_s);
		int i=Integer.parseInt(s_i);
		long l=Long.parseLong(s_l);
		float f=Float.parseFloat(s_f);
		double d=Double.parseDouble(s_d);
	}

}
