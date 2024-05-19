import java.util.Scanner;
class mark_v2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mark1, mark2;

		System.out.print("Enter a mark (within 0 t0 100 inclusive): ");
		mark1=sc.nextInt();
		mark2=sc.nextInt();

		if(mark1>100 || mark1<0 || mark2>100 || mark2<0) System.out.println("Wrong input range");
		else if (mark1>=40 && mark2>=40){
			if(mark1>=80 || mark2>=80)System.out.println("Pass with Distinction"); 
			else if (mark1>=65 && mark2>=65) System.out.println("Pass with Credit"); 
		else System.out.println("Pass"); 
		} 
		else System.out.println("Fail");
	}
}