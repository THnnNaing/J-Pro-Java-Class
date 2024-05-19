import java.util.Scanner;
class linearsearch{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numArr[]={23,12,23,4,5,67,324,12,90,89};
		int searchValue, foundIndex=-1;
		
		System.out.print("Enter searchValue : ");
		searchValue = sc.nextInt();

		for (int i=0; i<numArr.length ;i++ ) {//array.length <- no. of elements in array
			if (searchValue==numArr[i]) {
				foundIndex=i;
				break;	
			}
		}
		if (foundIndex>-1) {
			System.out.println("Found" + searchValue+ "at"  + (foundIndex+1)+ "position in array");
		}
		else System.out.println("Not Found "+searchValue+"in array");
	}
}