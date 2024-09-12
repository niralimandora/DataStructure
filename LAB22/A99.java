simport java.util.Scanner;
class A99
{
	public static void shell(int a[],int n)
	{
		for(int gap=n/2;gap>=1;gap=gap/2)
		{
			for(int j=gap;j<n;j++)
			{
				for(int i=j-gap;i>=0;i=i-gap)
				{
					if(a[i+gap]>a[i])
					{
						break;
					}
					else
					{
						int temp=a[i+gap];
						a[i+gap]=a[i];
						a[i]=temp;
					}
				}
			}
		}
	}

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.print("enter a array element "+ i +" :");
			a[i]=sc.nextInt();
		}

		System.out.println();

		System.out.print("unsorted element:");
	 	for(int i=0;i<n;i++)
	 	{
	 		System.out.print(a[i] +",");
	 	}

	 	System.out.println();
	 	shell(a,n);
	 	System.out.println();

	 	System.out.print("sorted element:");
	 	for(int i=0;i<a.length;i++)
	 	{
	 		System.out.print(a[i] +",");
	 	}
	 	sc.close();
	}
}