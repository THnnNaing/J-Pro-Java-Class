// Command_lineInput.java
// ask user to enter two numbers, display the addition of them

class UserInput_CL{
	public static void main(String[] args) {
		int num1, num2, ans;

		System.out.println("Enter First Number :");
		num1=Integer.parseInt(args[0]);
		System.out.println("Enter Second Number : ");
		num2= Integer.parseInt(args[1]);
		ans = num1 + num2;

		System.out.println("Addition Result : "+ans);
	}
}