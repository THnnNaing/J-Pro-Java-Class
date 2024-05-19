import java.util.Scanner;
class studentdata{
	public static void main(String[] args) {
		//declaration
		int age[]= new int[16]; // index => 0 ... 15
		Scanner sc = new Scanner(System.in);

		//array input
		age[11]=20;
		age[2]=18;

		//array output
		System.out.print(age[11]);
	}
}