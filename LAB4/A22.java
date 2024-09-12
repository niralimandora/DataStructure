//delet
import java.util.Scanner;
class A22{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a size array");
			int s=sc.nextInt();
		//first array//
			int a[]=new int[s];

			for(int i=0;i<a.length;i++)
			{
				System.out.print("enter element-");
				a[i]=sc.nextInt();
			}
		//second array//	
			int b[]=new int[s-1];
		//index//
			System.out.println("enter a index");
			int d=sc.nextInt();

		for(int i=0;i<d;i++)
			{
				//assing//
				b[i]=a[i];
			}
		for(int i=d;i<b.length;i++)
		{
			b[i]=a[i+1];
		}

			for(int i=0;i<b.length;i++)
			 {
			 	System.out.println("enter element="+b[i]);
			 }

			
	}
}
