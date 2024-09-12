import java.util.Scanner;
class A96
{
	public void mergesort(int a[], int low, int high)
	 {
	 	int mid;
	 	if(low<high)
	 	{
	 		mid=(low+high)/2;
	 		mergesort(a,low,mid);
	 		mergesort(a,mid+1,high);
	 		merge(a,low,mid,high);
	 	}
	 }
	 public void merge(int a[], int low, int mid, int high)
	 {
	 	int b[]=new int[a.length];
	 	int h=low;
	 	int i=0;
	 	int j=mid+1;
	 	while(h<=mid && j<=high)
	 	{
	 		if(a[h]<=a[j])
	 		{
	 			b[i]=a[h];
	 			h++;
	 		}
	 		else
	 		{
	 			b[i]=a[j];
	 			j++;
	 		}
	 		i++;
	 	}
	 	if(h>mid)
	 	{
	 		for(int k=j;k<=high;k++)
	 		{
	 			b[i]=a[k];
	 			i++;
	 		}
	 	}
	 	else
	 	{
	 		for(int k=h;k<=mid;k++)
	 		{
	 			b[i]=a[k];
	 			i++;
	 		}
	 	}
	 	for(int k=low;k<=high;k++)
	 	{
	 		a[k]=b[k-low];
	 		// System.out.println(a[k]);
	 	}
	 }
	 public static void main(String[] args) {
	 	Scanner sc=new Scanner(System.in);
	 	System.out.print("enter a size of array=");
	 	int size=sc.nextInt();
	 	A96 ss= new A96();
	 	int a[]=new int[size];
	 	for(int i=0;i<size;i++)
	 	{
	 		System.out.print("enter element=");
	 		a[i]=sc.nextInt();
	 	}

	 	System.out.print("unsorted element:");
	 	for(int i=0;i<size;i++)
	 	{
	 		System.out.print(a[i] +",");
	 	}

	 	System.out.println();
	 	ss.mergesort(a,0,size-1);
	 	System.out.println();
	 	System.out.print("after sorting:");
	 	for(int i=0;i<size;i++)
	 	{
	 		System.out.print(a[i]+",");
	 	}

	 }
	
}