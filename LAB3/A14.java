


import java.util.Scanner;
class A14{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a starting point:");
		int m=sc.nextInt();

		System.out.println("enter a ening point:");
		int n=sc.nextInt();

		int sum=0;
		for(int i=m;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum is="+sum);


	}
}