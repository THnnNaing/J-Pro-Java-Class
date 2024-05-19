/**
 * both are return found index
 * 1. indexOf (from beginning) left-right
 * 		-char
 * 		-String
 * 		->beginning
 * 		->given start index
 * 2. lastIndexOf (from end) right to left
 */
public class StringIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Mg Mg is a IT student, he is a good player in football team."
				+ " And, he is also good trainer in basket ball. "
				+ "And also, he is a member of student union. And then, he has good attitude.";
		
		//using index of
		System.out.println(s.indexOf('a'));//9
		System.out.println(s.indexOf('a',10));//29
		System.out.println(s.indexOf("he"));//23
		System.out.println(s.indexOf("he",25));//66
		
		System.out.println(s.length());
		
		//using index of
		System.out.println(s.lastIndexOf('a'));//171
		System.out.println(s.lastIndexOf('a',170));//163
		System.out.println(s.lastIndexOf("he"));//159
		System.out.println(s.lastIndexOf("he",150));//116
	}

}
