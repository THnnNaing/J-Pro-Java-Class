
public class Student_ReadOnly {
	
	// read only , read and write only by own
	private String rno;
	private String name;
	
	//allow write data
	// using set function
	void setRno (String r) {
		rno = r;
	}
	
	void setName (String n) {
		name = n;
	}
	
	//allow read data
	//using get function
	public String getRno() {
		return rno;
	}
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		Student_ReadOnly s= new Student_ReadOnly();
		s.name="Mya Mya";
		s.rno="JPRO-00002";
		
	}
}
