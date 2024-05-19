/**
 * 1. concat()->combine two strings(same with + operator)
 * 2. length()->finding the length of the string
 * 3. trim()->removing the start and end of the space from String
 * 4. isEmpty()->for presence check, checking the string is empty or not
 * 5. charAt()->return the character of given index
 */
public class StringExistingOperatiors {
	public static void main(String[] args) {
		String s1="Hello ";
		String s2="World.";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.length());
		
		String s3="  Hello World.  ";
		System.out.println(s3.trim());
		
		String s4="";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());
		
		System.out.println(s1.charAt(1));
	}
}
