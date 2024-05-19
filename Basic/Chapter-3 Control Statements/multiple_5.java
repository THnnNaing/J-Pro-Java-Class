//Multiple_5.java
/*
	5 10 15 20 25
	30 35 40 45 50
	55 60 65 70 75
	80 85 90 95 100
*/
class multiple_5 {
	public static void main(String[] args) {
		// for (int i=5; i<=100; i+=5) {
		// 	System.out.print(i+ " ");
		//  	if (i%25==0) 
		//  	System.out.println();
		//  } 
		int res;
		for (int i=1; i<=20 ; i++) {
			res=i*5;
			System.out.print(res + " ");
			if (res%25==0) 
				System.out.println();
		}
	}
}