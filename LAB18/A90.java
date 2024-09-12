 // Write a program to implement a Linear Search using Array.
import java.util.Scanner;
class A90
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a array of size");
		int a=sc.nextInt();
		int b[]=new int[a];

			for(int i=0;i<b.length;i++)
			{
				System.out.print("enter element-");
				b[i]=sc.nextInt();
			}

		System.out.println("enter your key value");
		int key=sc.nextInt();
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==key)
			{
				System.out.println("element found in index:"+i);
				return ;

			}
			else 
			{
		
			}
		}
	}
}