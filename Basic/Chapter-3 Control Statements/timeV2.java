import java.util.Scanner;
class timeV2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1,m1,s1,h2,m2,s2,toth,totm,tots;
		char ch; //for user option -> to continue for next time

		do{
			// time start
			System.out.println("Enter first time value (hh:mm:ss) :");
			h1=sc.nextInt();
			m1=sc.nextInt();
			s1=sc.nextInt();

			System.out.println("Enter second time value (hh:mm:ss) :");
			h2=sc.nextInt();
			m2=sc.nextInt();
			s2=sc.nextInt();

			toth=h1+h2;
			totm=m1+m2;
			tots=s1+s2;

			if (tots>=60) {
				totm+=tots/60;
				tots%=60;
			}
			if (totm>=60) {
				toth+=totm/60;
				totm%=60;
			}

			System.out.println("Time 1 :"+h1+":"+m1+":"+s1);
			System.out.println("Time 2 :"+h2+":"+m2+":"+s2);
			System.out.println("total :"+toth+":"+totm+":"+tots);
			//time end
			System.out.print("Continue or not (y|n)? :");
			ch = sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
}