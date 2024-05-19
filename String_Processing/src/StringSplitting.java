/**
 * 1.subString -> extract only the required sub string from original
 * 2.split -> splitting the original into multiple string by regex (return String array) //regex=regular expression
 */
public class StringSplitting {

	public static void main(String[] args) {
		String s ="Mg Mg is a IT student, he is a good player in football team."
				+ " And, he is also good trainer in basket ball. "
				+ "And also, he is a member of student union. And then, he has good attitude.";
		
		//using subString
		System.out.println("Original"+s);
		System.out.println("Extract the sub string from index 30 :\n"+s.substring(30));
		System.out.println("Extract the sub string from index from 30 to 150:\n"+s.substring(30,150));
		
		//using split
		String sub[]=s.split("\\s");//white space
		System.out.println(sub.length);
		for(String ss:sub) {
			System.out.println(ss);
		}
	}

}
