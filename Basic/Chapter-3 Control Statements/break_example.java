import java.util.Scanner;
class break_example {
	public static void main(String[] args) {
		// 1 to 10
		for (int i=1; i<=10 ;i++ ) {
			System.out.print(i+" ");
		}
		System.out.println();

		// 1 2 4 5 7 8 10 -> 3 6 9 
		for (int i=1; i<=10 ;i++ ) {
			if (i%3==0) continue;
			System.out.print(i+" ");
		}
		System.out.println();

		// 10 numbers input -> 3%==0 0-> end the loop
		Scanner sc = new Scanner(System.in);
		int num;
		for (int i=1; i<=10; i++) {
			System.out.print("Enter a number");
			num = sc.nextInt();
			if (num%3==0) break;
			
		}
	}
}