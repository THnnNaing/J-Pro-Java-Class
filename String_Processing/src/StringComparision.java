/**
 * String comparison operators 
 * 1. using == -> (only for non primitive String data) return true or false
 * 2. using equals() -> (compare value, not data type) returrn trrue or false
 * 3. using compareTo() -> return +,0,-
 * 							0 means equal, + means >, -means < 
 * 4. using equalsIgnoreCase     
 */

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Apple";
		String s2="apple";
		String s3=new String("Apple");
		String s4=new String("Apple");
		String s5="Apple";
		
		//using ==
		System.out.println(s1==s2);//false(uppercase != lowercase)
		System.out.println(s1==s5);//true
		System.out.println(s1==s3);//false(non primitive variable != object variable)
		System.out.println(s3==s4);//false (both are objects)
		
		//using .equals()
		System.out.println(s1.equals(s2));//false (uppercase != lowercase)
		System.out.println(s1.equals(s5));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s3.equals(s4));//true
		
		//using compareTo()
		System.out.println(s1.compareTo(s2));//Apple<apple=> -value
		System.out.println(s1.compareTo(s3));//0
		System.out.println(s2.compareTo(s1));//apple > Apple => +value
		
		//using equalsIgnoreCase
		System.out.println(s1.equalsIgnoreCase(s2));//Apple ignore case apple -> true
	}

}
