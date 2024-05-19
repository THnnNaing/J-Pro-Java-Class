import java.util.Scanner;
class mark{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mark;

		System.out.print("Enter a mark (within 0 t0 100 inclusive): ");
		mark=sc.nextInt();

		if(mark>100 || mark<0) System.out.println("Wrong input range.");
		if (mark>=80) System.out.println("Pass with Distinction."); 
		else if (mark>=65) System.out.println("Pass with Credit."); 
		else if (mark>=40) System.out.println("Pass."); 
		else System.out.println("Fail.");
		
	}
}