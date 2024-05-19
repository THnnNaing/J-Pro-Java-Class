import java.util.Scanner;
class max{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num[]=new int[10];
		int max;

		System.out.print("Enter first number : ");
		num[0]=sc.nextInt();
		max=num[0];

		for (int i=1; i<10; i++){
			System.out.print("Enter next number : ");
			num[i]=sc.nextInt();
			if(num[i]>max)
				max=num[i];
		}

		System.out.print("Array Data :");
		for(int i=0;i<10; i++)
			System.out.print(num[i]+" ");
		System.out.println();
		System.out.println("Maximun value : "+max);
	}
}