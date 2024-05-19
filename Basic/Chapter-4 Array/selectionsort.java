class SelectionSort{
	public static void main(String[] args) {
		int numArr[]={23,12,23,4,5,67,324,12,90,89};

		System.out.print("Original Data :");
		for (int i=0; i<numArr.length ;i++ ) 
			System.out.print(numArr[i]+" ");
		System.out.println();
			
		int temp;
		for (int i=0; i<numArr.length-1; i++) {
			for (int j=i+1; j<numArr.length; j++){
				if (numArr[i]>numArr[j]) {
					temp=numArr[i]; // nay yar htae tr
					numArr[i]=numArr[j]; // i ka ar twr loh j htl ka kg lr htae tr
					numArr[j]=temp; // j ka ar twr loh (i se youk twr tr) temp htl ka kg lr htae tr
				}
			} 
		}

		System.out.print("Ascending order of Array Data : ");
		for (int i=0; i<numArr.length ;i++ ) {
			System.out.print(numArr[i]+" ");
		System.out.println();
		}
		
	}
}