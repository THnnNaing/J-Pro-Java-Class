package interface_eg;

public class interfaceMain {

	public static void main(String[] args) {
//		Employee e = new Employee(); interfacee can't creat object
		
		Student s = new Student();//superclass can create object
		
		Employee temp = new TeachingAssistant();//object create using implemented class
		Employee interms = new InterStudent();
		
		TeachingAssistant tass = new TeachingAssistant();
		
		System.out.println("Teaching Assistant salary:"+temp.calculateSalary()); //interface object -> can only call interface's method
		
		tass.setName("Maung Maung");
		
//		array of superclass
		Student ss[] = new Student[3];
		ss[0] = new TeachingAssistant(); // can't call child method and member data
		ss[1] = new InterStudent();
		ss[2] = new Student();
		
//		array of interface
		Employee ee[] = new Employee[3];
		ee[0] = new TeachingAssistant(); // can't call child method and member data
		ee[1] = new InterStudent();	
//		ee[2] = new Employee();
	}

}
