import java.util.Scanner;
class student{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[]={"ag","mg","kg","sg","yg"};
		name[3]="makazaki hanakoshimi"; //override the name
		int age[]=new int[5];

		for (int i=0; i<5; i++) {
			System.out.print("Enter age for "+name[i]+" : ");
			age[i]=sc.nextInt();
		}
	}
}