package hierarchical_inheritance;

public class JproMain {

	public static void main(String[] args) {
		Student s = new Student("JPRO-0001","Mg Maung","Male","Science");
		
		System.out.println("Normal Student");
		System.out.println("Roll No:"+s.getRno());
		System.out.println("Name:"+s.getName());
		System.out.println("Gender:"+s.getGender());
		System.out.println("Major:"+s.getMajor());
		System.out.println();
		
		ITStudent it = new ITStudent("JPRO-0002","Mg Aung","Male","IT","IP,N5,Business English,Java");
		
		System.out.println("IT Student");
		System.out.println("Roll No:"+it.getRno());
		System.out.println("Name:"+it.getName());
		System.out.println("Gender:"+it.getGender());
		System.out.println("Major:"+it.getMajor());
		System.out.println("Subject List:"+it.getSubNames());
		
		JPStudent jp  = new JPStudent("JPRO-0003","Ma Nwe","Female","JP","N5","4 Skills");
		
		System.out.println("JP Student");
		System.out.println("Roll No:"+jp.getRno());
		System.out.println("Name:"+jp.getName());
		System.out.println("Gender:"+jp.getGender());
		System.out.println("Major:"+jp.getMajor());
		System.out.println("Level:"+jp.getLevel());
		System.out.println("Skills:"+jp.getSkills());
	}

}
