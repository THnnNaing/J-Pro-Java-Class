/**
 * Decimal -base 10
 * Binary -base 2
 * Octal -base 8
 * Hexadecimal -base 16
 */

package conversion;

public class NumberConversion {
	public static void main(String[] args) {
	//other to decimal
	//decimal to binary
	System.out.println("Binary 101010 to:"+Integer.parseInt("101010",2));//0 or 1
	
	//decimal to octal
	System.out.println("Octal 14574 to:"+Integer.parseInt("14574",8));//0 to 7
	
	//decimal to hexadecimal
	System.out.println("Hexacial af789 to:"+Integer.parseInt("af789",16));//0-9,a-f
	
	//decimal to others
	//decimal to binary 
	System.out.println("Decimal 8900 to Binary:"+Integer.toBinaryString(8900));
	
	//decimal to binary 
	System.out.println("Decimal 5678 to Hexadcimal"+Integer.toBinaryString(5678));
		
	//decimal to binary 
	System.out.println("Decimal 6789 to Octal"+Integer.toBinaryString(6789));
	}
}
