import java.util.Scanner;
class lottery {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;

		System.out.print("Enter number between 1 and 50 inclusive :");
		num=sc.nextInt(); 

		switch(num){
			case 20:
			case 25:System.out.println("You Won Rolex");break;
			case 5:System.out.println("You Won Lamboghini");break;
			case 3:
			case 45:System.out.println("You Won Chervolete");break;
			case 9:System.out.println("You Won Roll Royce");break;
			case 18:System.out.println("You Won Girlfriend");break;
			default:System.out.println("Sorry, you lose");
		}
	}
}

// page 9 all ex 
// ex 123