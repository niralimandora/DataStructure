import java.util.Scanner;
class A33{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//input the two number
		System.out.print("enter first number:");
		int n1=sc.nextInt();

		System.out.print("enter second number:");
		int n2=sc.nextInt();

		System.out.println("\nbefore swapping:");
		System.out.println("first number:"+n1);
		System.out.println("second number:"+n2);

		//call the swep metjod
		int[] ans=swapNumber(n1,n2);
		n1=ans[0];
		n2=ans[1];
		System.out.println("\nafter swapping:");
		System.out.println("first number:"+n1);
		System.out.println("second number:"+n2);

		sc.close();
	}

	//method to swap
	static int[] swapNumber(int num1,int num2)
	{
		int a[]=new int[2];
		int temp = num1;
		num1 = num2;
		num2 = temp;
		a[0]=num1;
		a[1]=num2;

		return a;

		// System.out.println("\nafter swapping:");
		// System.out.println("first number:"+num1);
		// System.out.println("second number:"+num2);
	}
}