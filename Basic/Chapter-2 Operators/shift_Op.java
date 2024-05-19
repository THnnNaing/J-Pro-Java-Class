// Shift_Op.java
// left <<
// right >>
// right >>> -> negatvie value
class Shift_Eg{
	public static void main(String[] args) {
		// 10 -> 00010100
		byte a=20;

		// << means -> multiply 2^digit, eg <<3 -> * 2^3
		// leftshift -> * // rightshift -> / 
		// 000 10100<<2 ->  10100 000 -> 160 (20 * 2^3 = 20*8 = 160)
		System.out.println("20<<3 :"+(a<<3));

		// 00010 100>>2 -> 000 00010 -> 2 (20 / 2^3 = 20/8 = 2)
		System.out.println("20>>3 :"+(a>>3));

		System.out.println("20>>>3 :"+(a>>>3));

		System.out.println("20>>3 :"+((-a)>>3));
		System.out.println("20>>>3 :"+((-a)>>>3));


	}
}