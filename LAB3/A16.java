import java.util.Scanner;
class A16{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=sc.nextInt();
		int n[]
		=new int[a];
		System.out.println("enter a elements:");
		for(int i=0;i<n.length;i++)
		{
			n[i]=sc.nextInt();
		}
		int max=n[0];
		int min=n[0];
		int i;
		for(i=0;i<n.length;i++)
		{
			if(max<n[i])
			{
				max=i;
			}
			if (min>n[i])
			{
				min=i;
			}
		}
		System.out.println("maximum number="+max);
		System.out.println("manimum number="+min);


	}
}