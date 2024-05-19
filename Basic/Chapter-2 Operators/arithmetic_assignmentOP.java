class AA_Op{
	public static void main(String[] args) {
		int a=10;
		int b=4;

		int ans= a+b;
		System.out.println(a+ " + "+b+" = "+ans);

		int c=12;
		c+=ans; //c=c+ans or c=c+a+b;
		System.out.println(c);

		int div=c/b;
		int rem=c%b;
		float div_f=c/(b*1.0f); //*1.0f -> for show the decimal result
		System.out.println("Whole Division result :"+div);
		System.out.println("Fraction of  Division result :"+div_f);
		System.out.println("Remainder of Division result :"+rem);
	}
}  