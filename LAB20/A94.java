import java.util.Scanner;
class A94
{
	int a[];
	 A94(int size)
	 {
	 	a = new int[size];
	 }
	 public void selection()
	 {
	 	for(int i = 0;i < a.length;i++)
	 	{
	 		int mid = i;
	 		for(int j =i+1;j<a.length;j++)
	 		{
	 			if(a[j]<a[mid])
	 			{
	 				mid=j;
	 			}
	 		}
	 		if(mid!=i)
	 		{
	 			int temp=a[i];
	 			a[i]=a[mid];
	 			a[mid]=temp;
	 		}
	 	}
	 	for(int k=0;k<a.length;k++)
	 	{
	 		System.out.print(a[k]+",");
	 	}
	 }
	 public static void main(String[] args) {
	 	Scanner sc=new Scanner(System.in);
	 	System.out.print("enter a size of array=");
	 	int size=sc.nextInt();
	 	A94 ss = new A94(size);
	 	for(int i=0;i<size;i++)
	 	{
	 		System.out.print("enter element=");
	 		ss.a[i]=sc.nextInt();
	 	}
	 	ss.selection();
	 }
	
}