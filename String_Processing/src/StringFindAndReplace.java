/**
 * 1.Find
 * 	a. startsWith
 * 	b. endsWith
 * 	c. contains
 * 2.Replace
 * 	a. replace() -> one time replace for first found
 * 	b. replaceAll()
 */
public class StringFindAndReplace {

	public static void main(String[] args) {
		String s ="Mg Mg is a IT student, he is a good player in football team."
				+ " And, he is also good trainer in basket ball. "
				+ "And also, he is a member of student union. And then, he has good attitude.";
		
		//finding
		System.out.println("Find -> Start with Mg: "+s.startsWith("Mg"));//true
		System.out.println("Find -> End with Mg: "+s.endsWith("Mg"));//false
		System.out.println("Find -> he in the sentence: "+s.contains("he"));//true
		
		//replacing
		String s2=s.replace(" he", " she");
		System.out.println("Original: "+s);
		System.out.println("Replace one time: "+s2);
	}

}
