class UnaryOp{
	public static void main(String[] args) {
		int a=10;
		int b;
		// b=++a; // 11, 11,   assignment(second), prefix(first)
		b=a++; //11, 10, assignment(first), postfix(second)
		System.out.println(a+" "+b);

		a=11, b=10,
		int d=34;
		int c=++d - b-- + a--;
		// assignment(fourth), pre(first), post(final), arithemetic + (third), - (second)
		// c = 35 - 10 + 11;
		// c = 25 + 11
		// c = 36 
		// a =10 , b=9, c=36, d=35
		// true AND true OR false -> true 
		// False OR true AND True -> true
	}
	
}