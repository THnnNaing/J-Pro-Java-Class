/*
	original data -> 4 5 2 6 7 
	asc sorting 
	no. of elements = 5

	general -> no. of times -> 4 times

	first time
	 4 5 2 6 7  (1 and 2) -> (4<5)
	 4 5 2 6 7  (2 and 3) -> (5<2) change
	 4 2 5 6 7  (3 and 4) -> (5<6) 
	 4 2 5 6 7  (4 and 5) -> (6<7)

	second time 
	 4 2 5 6  (1 and 2) -> (4<2) change
	 2 4 5 6  (2 and 3) -> (4<5) 
	 2 4 5 6  (3 and 4) -> (5<6)

	third time
	 2 4 5  (1 and 2) -> (2<4)
	 2 4 5  (2 and 3) -> (4<5)

	fourth time
	 2 4  (1 and 2) -> (2<4) (no more to do)
*/
class bubblesort{
	public static void main(String[] args) {
		int numArr[]={45,40,12,3,24,65,7,96,56};
		int first=0, last=numArr.length-1;
		boolean swap; 
		do{
			swap = false;
			//for each time
			for (int i=first; i<last-1; i++) { //last-1 for last element that has no pair
				if(numArr[i]>numArr[i+1]){
					temp=numArr[i];
					numArr[i]=numArr[i+1];
					numArr[i+1]=temp;
					swap=true;
				}
			}
			last-=1;
		}
		while(last>1 || swap);
		System.out.print("Ascending orrderr of Array");
		for (int i=0; i<numArr.length; i++) {
		System.out.print(numArr[i]+" ");
		}
	}

}