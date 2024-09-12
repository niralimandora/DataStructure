import java.util.Scanner;
import java.lang.Math;
class A1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter redius:");
		double r=sc.nextDouble();
		double ans=(Math.PI*r*r);
		System.out.println("area of circle="+ans);
	}
}