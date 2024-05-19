
public class NullPointerExcep_Eg {

	public static void main(String[] args) {
		String s=null;
		
		try {
			System.out.println("String length:"+s.length());
		}
		catch(NullPointerException e) {
			System.out.println("Null error, your string is empty or null");
		}
	}

}
