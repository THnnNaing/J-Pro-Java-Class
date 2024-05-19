/**
 * Factorial
 * 5!=5 x 4 x 3 x 2 x 1 =120
 * loop -> no. of time to loop -> know (for, while, do while) -> for
 * forward direction -> start =1, stop=n, step =1 (user input => n, stop=n)
 * backward direction -> start = m, stop=1, stetp =-1
 * */
 class Factorial_v1{
 	public static void main(String[] args) {
 		int factorial=1; // muliplication -> default is 1

 		for (int i=5; i>=1; i-- ) 
 			factorial *=i;
 		System.out.println("5!"+factorial);
 	}
 }
