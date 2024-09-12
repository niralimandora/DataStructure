
import java.util.Scanner;
class A4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int a=sc.nextInt();
		int ans=1;
		for(int i=a;i>0;i--)
		{
			ans=ans*i;
		}
		System.out.println(ans);
	}
}