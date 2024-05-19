class TypeCasting{
	public static void main(String[] args) {
		byte b =120;
		int i;
		long l=340;
		double d;

		// Widening casting 
		// smaller size -> larger size
		i=b;
		System.out.println(i);
		// System.out.println(b);
		// System.out.println(l);
		// System.out.println(d);

		// Narrowing casting 
		// larger size -> smaller size
		i=(int)l;
		System.out.println(i);
		// 1B -> -128 to 127
		// 340 -> 0001 0101 0100 -> 0101 0100 -> 84
		b = (byte)i;
		System.out.println(b);
	}
}