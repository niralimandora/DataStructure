import java.util.Scanner;
public class A35

{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		student_details[] students=new student_details[5];

		for(int i=0;i<students.length;i++)
		{
			System.out.println("enter student details");
			System.out.print("enter employee enrollment no:");
			int enrollmentno=sc.nextInt();
			System.out.print("enter employee name:");
			String name=sc.next();
			System.out.print("enter employee semester:");
			int semester=sc.nextInt();
			System.out.print("enter employee cpi:");
			double cpi=sc.nextDouble();

			students[i]=new student_details(enrollmentno,name,semester,cpi);
		}
		System.out.println("all student");
		for(student_details student: students){
			student.displayDetails();
		}

		sc.close();

	}
	
}
class student_details
	{
		private int Enrollmentno;
		private	String Name;
		private	int Semester;
		private	double Cpi;

		//consrtucter

		public student_details(int enrollmentno,String name,int semester,double cpi)
		{
			this.Enrollmentno=enrollmentno;
			this.Name=name;
			this.Semester=semester;
			this.Cpi=cpi;
		}

		public void displayDetails()
		{
			System.out.println("employee enrollmentno:"+Enrollmentno);
			System.out.println("employee name:"+Name);	
			System.out.println("employee semester:"+Semester);
			System.out.println("employee cpi:"+Cpi);
		}
	}