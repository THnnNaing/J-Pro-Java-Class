// Bitwise_Logical_Op.java
class Bitwise_Logical_Op{
	public static void main(String[] args) {
		int a=20, b=24; //20 -> 10100, 24 -> 11000

		//   10100
		// & 11000
		// -------------

		// & 10000 (16)
		System.out.println("20 & 24 : "+(a&b)); //16

		// | -> 11100 -> 28
		System.out.println("20 | 24 : "+(a|b)); //28

		// ^ -> 01100 -> 12
		System.out.println("20 ^ 24 : "+(a^b)); //12

		boolean c=true, d=false;
		System.out.println("true & false : "+(c&d));
		System.out.println("true && false : "+(c&&d));

		System.out.println("true | false : "+(c|d));
		System.out.println("true &| false : "+(c||d));
	}
}