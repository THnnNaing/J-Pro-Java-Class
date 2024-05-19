/**
 * each distance -> ft in 
 * volume -> length * width * height
**/
import java.util.Scanner;
class distance_v1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f1, in1, f2, in2, f3, in3, vFoot, vInch;

		System.out.print("Enter distance value for length (ft,in) : ");
		f1 = sc.nextInt();
		in1 = sc.nextInt();

		System.out.print("Enter distance value for width (ft,in) : ");
		f2 = sc.nextInt();
		in2 = sc.nextInt();

		System.out.print("Enter distance value for height (ft,in) : ");
		f3 = sc.nextInt();
		in3 = sc.nextInt();

		vFoot=f1*f2*f3;
		vInch=in1*in2*in3;

		if (vInch>=12) {
			vFoot+=vInch/12;
			vInch%=12;
		}

		System.out.println("length :"+f1+"\'"+in1+"\"");//4'5"
		System.out.println("height :"+f2+"\'"+in2+"\"");//4'5"
		System.out.println("width :"+f3+"\'"+in3+"\"");//4'5"
		System.out.println("volume :"+vFoot+"\'"+vInch+"\"");//4'5"
	}
}