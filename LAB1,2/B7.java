//Write a program to find factors of a given number.
import java.util.Scanner;
class B7{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i+",");
			}
		}
	}
}