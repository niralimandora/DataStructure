//Write a program to check whether a number is prime or not.
import java.util.Scanner;
class B8{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting number");
		int a=sc.nextInt();
		System.out.println("enter ending number");
		int b=sc.nextInt();

		boolean fleg=false;

		for(int i=a;i<=b;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					fleg=false;
					break;
				}
				else
				{
					fleg=true;
				}
			}
			if(fleg==true)
			{
				System.out.println(i);
			}
		}

	}
}