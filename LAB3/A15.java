
import java.util.Scanner;
class A15{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter number=");
		int n=sc.nextInt();

		int sum=0;

		System.out.println("enter number");
		for (int i=1;i<=n;i++ ) 
		{
			sum=sum+i;
		}
		System.out.println("sum is="+sum);

		int avg=sum/n;
		System.out.println("avg is="+avg);
	}
}