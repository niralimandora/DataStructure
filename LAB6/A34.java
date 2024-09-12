import java.util.Scanner;
public class A34

{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//employee details
		System.out.print("enter employee id:");
		int id=sc.nextInt();
		System.out.print("enter employee name:");
		String name=sc.next();
		System.out.print("enter employee designation:");
		String designation=sc.next();
		System.out.print("enter employee salary:");
		double salary=sc.nextDouble();

		Employee_detail emp=new Employee_detail(id,name,designation,salary);

		emp.displayDetails();

		sc.close();

	}
	
}
class Employee_detail
	{
		private int E_id;
		private	String Name;
		private	String Designation;
		private	double Salary;

		//consrtucter

		public Employee_detail(int id,String name,String designation,double salary)
		{
			this.E_id=id;
			this.Name=name;
			this.Designation=designation;
			this.Salary=salary;
		}

		public void displayDetails()
		{
			System.out.println("enter employee id:"+E_id);
			System.out.println("enter employee name:"+Name);	
			System.out.println("enter employee designation:"+Designation);
			System.out.println("enter employee salary:"+Salary);
		}
	}