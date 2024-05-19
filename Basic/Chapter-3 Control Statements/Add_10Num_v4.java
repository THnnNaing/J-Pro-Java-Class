/**
 * do while loop (post testt loop)
 * start 
 * do{
 * ......
 * step
 * }while(stop);
**/

class Add_10Num_v4{
	public static void main(String[] args) {
		int sum=0,i;

		i=1;
		do{
			sum+=i;
			i++
		}while(i<=10);
		System.out.println("Addition of first 10 numbers : "+ sum);
	}
}