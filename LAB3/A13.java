
 import java.util.Scanner;
class A13{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number:");
			int a=sc.nextInt();
			int b[]=new int[a];

			for(int i=0;i<b.length;i++)
			{
				System.out.print("enter element-");
				b[i]=sc.nextInt();
			}

			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
				
			}


	}
}