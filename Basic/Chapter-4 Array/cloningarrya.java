class arrayclone{
	public static void main(String[] args) {
		int numArr[]={23,12,23,4,5,67,324,12,90,89};
		
		int copyArr[]=orgArr.clone();

		for(int a:copyArr) //for each loop ()
			System.out.print(a+" ");
	}
}