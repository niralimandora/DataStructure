import java.util.Scanner;
class A3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Character");
		char c=sc.next().charAt(0);

		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
			c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("Character is vowel");
		}
		else
		{
			System.out.println("Character is constant");

		}
	}
}