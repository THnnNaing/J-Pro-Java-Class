
public class Student_Constructor {
//	member data -> private
	private String name;
	private int age;
	
//	constructor -> argument constructor or no argument constructor 
//	no argument constructor or default
	public Student_Constructor() {
		System.out.println("Hello World");
		name = "ABC"; //default value 
		age = 16; // default value
	}
	
//	member function -> read (get method), write (set method)
//	for age
	public int getAge() {
		return age;
	}
	
	public void setAge (int a) {
		age = a;
	}
	
//	for name -> get set
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
