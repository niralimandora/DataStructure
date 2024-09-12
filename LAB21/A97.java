import java.util.Scanner;
class A97{

	public static void quick(int arr[],int LB,int UB)
	{
		boolean flag = true;
		if(LB < UB)
		{
			int i=LB;
			int j=UB+1;
			int key= arr[LB];

			while(flag==true)
			{
				i++;
				while(i<arr.length && arr[i]<key)
				{
					i++;
				}
				j--;

				while(j>=0 && arr[j]>key)
				{
					j--;
				}

				if(i < j)
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				else 
				{
					flag= false;
				}
			}


			int temp =arr[LB];
			arr[LB] = arr[j];
			arr[j] = temp;

			quick(arr,LB,j-1);
			quick(arr,j+1,UB);
		}
	}

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
	 	{
	 		System.out.print("enter element "+ i + " :");
	 		arr[i]=sc.nextInt();
	 	}

	 	System.out.println("unsorted element:");
	 	for(int i=0;i<size;i++)
	 	{
	 		System.out.print(arr[i] +" ");
	 	}

	 	System.out.println();

	 	quick(arr,0,size-1);

	 	System.out.println();


	 	System.out.println("sorted element:");
	 	for(int i=0;i<arr.length;i++)
	 	{
	 		System.out.print(arr[i] +" ");
	 	}
	 	sc.close();
	}
}
