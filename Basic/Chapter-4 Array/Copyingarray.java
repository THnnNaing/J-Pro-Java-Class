class ArrayCopy{
	public static void main(String[] args) {
		int orgArr[]={45,3,5,12,44,53,33,45,99,100};
		int cArr[]=new int[4]; //copy only 4 elements -> 12,44,53,33

		for (int i=0; i<cArr.length; i++) {
			cArr[i]=orgArr[i+3];
		}

		//sourceArr,StartingIndex_of_SourceArr, destinationArr, startIndexOfDesArr, no.ofelements
		System.ArrayCopy(orgArr,3,,cArr,0,4);

		for (i=0; i<cArr.length;i++ ) {
			System.out.print(cArr[i]+" "); // 0 12 44, 53, 33
		}
	}
}