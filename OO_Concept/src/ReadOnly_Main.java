
public class ReadOnly_Main {

	public static void main(String[] args) {
		Student_ReadOnly s1=new Student_ReadOnly();
		
		s1.setName("Myo Myo");
		s1.setRno("JPRO-00002");
		
//		s1.name, s1.rno -> private
		System.out.println("Student Name : " + s1.getName());
		System.out.println("Student Rno  : " + s1.getRno());
		
	}

}
