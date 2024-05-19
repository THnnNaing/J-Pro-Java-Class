import java.util.Arrays;
class DefaultArraySort{
	public static void main(String[] args) {
		int orgArr[]={23,12,23,4,5,67,324,12,90,89};
		
		System.out.print("Original Data : ");
		for(int av:orgArr) System.out.print(av+" ");

		System.out.println();

		Arrys.sort(orgArr);
		System.out.print("Sorted Data: ");
		for (int av:orgArr) 
		System.out.print(av+" ");
	}
}