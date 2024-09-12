import java.util.Scanner;
class factorial
{
	double fact(int a)
	{
		if(a==0||a==1)
		{
			return 1;
		}
		else 
		{
			return fact(a-1)*a;	
		}
	}
}
class A5{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		factorial f=new factorial();
		double ans=f.fact(a);
		System.out.println(ans);
	}
}