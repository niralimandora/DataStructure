//circular QUEUE
import java.util.Scanner;
class Queue
{
	int a[];
    Queue(int size)
    {
        a = new int[size];
    }

    int front = -1;
    int rear = -1;

    void Insert(int n)
    {
    	if(rear >= a.length-1 && front==0 || rear+1==front)
    	{
    		System.out.println("Queue overflow");
    		return;
    	}
    	else
    	{
    		rear=(rear+1)%a.length;
    		a[rear]=n;
    		if(front==-1)
    		{
    			front=0;
    		}
    	}
    }

    int Delet()
    {
    	if(front==-1)
    	{
    		System.out.println("Underflow");
    		return -1;
    	}
    	else
    	{
    		int y=a[front];

    		if(front==rear)
    		{
    			front=-1;
    			rear=-1;
    		}
    		else if(front==a.length)
    		{
    			front=1;
    		}
    		else {
    			front++;
    		}
    		return y;
    	}
    }


    void display()
    {
        if (front<=rear) 
        {
            for(int i=front;i<=rear;i++)
        	{
            	System.out.print(" "+a[i]);
        	}
        }
        else
        {
        	for(int i=front;i<=a.length-1;i++)
        	{
        		System.out.print(a[i]);
        	}
        	for(int i=0;i<=rear;i++)
        	{
        		System.out.print(a[i]);
        	}
        }
        
        System.out.println();
    }
}


class A51
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of Queue");
		int size=sc.nextInt();
		Queue q=new Queue(size);
		int num=0;
		while(true)
		{
			System.out.println("1:Insert");
            System.out.println("2:Delet");
            System.out.println();
            System.out.print("Enter Choice: ");
            int c = sc.nextInt();
        
            switch (c) 
            {
                case 1:
                    System.out.print("Enter value to Insert: ");
                    num = sc.nextInt();
                    q.Insert(num);
                    q.display();
                    break;
                case 2:
                    System.out.println("Deleted Element: "+q.Delet());
                    q.display();
                    break;
            }
		}
	}
}