import java.util.Scanner;
public class A91rec{
	public static int serach(int arr[],int l,int r,int x)
	{
		if(r>=1)
		{
			int mid =l+(r-l)/2;

			if(arr[mid]==x)
			{
				return mid;
			}
			if(arr[mid]>x)
			{
				return serach(arr,l,mid-1,x);
			}
			else{
				return serach(arr,mid+1,r,x);
			}
		}
		return -1;
	}


	//main
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
    	//class object function call
    	A91 ob = new A91();

    	//array
    	System.out.print("enter a array of size:");
    	int a=sc.nextInt();
    	int array[]=new int[a];
    	for(int i=0;i<array.length;i++)
      	{
       		System.out.print("enter element "+array[i]+":");
      		array[i]=sc.nextInt();
      	}
      	int n = array.length;

    	System.out.println("choose your elment");
    	int key = sc.nextInt();


      	System.out.print("");
      	int value =serach(array,0,n-1,key);
      	if(value== -1)
      	{
      		System.out.println("not found");
      	}
      	else {
      		System.out.println(key+":"+"found at index:"+value);
      	}
	}


}
