class Add_10Num_v1{
	public static void main(String[] args) {
		int i,sum=0; //for addition -> default is 0
		for (i=1; i<=10;i++)//i+=1 <=> i=i+1
		sum+=i; //sum=sum+i;

		System.out.println("Addition of first 10 numbers : "+sum);
	}
}