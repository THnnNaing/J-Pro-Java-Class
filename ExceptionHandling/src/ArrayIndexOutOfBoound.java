import java.util.Iterator;

public class ArrayIndexOutOfBoound {

	public static void main(String[] args) {
		int num[]=new int[10];
		
		try {
			for (int i = 0; i < num.length; i++) {
				num[i]=(i*10)+1;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of index in array error");
		}

	}

}
