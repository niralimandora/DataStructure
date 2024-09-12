//QUEUE
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
    
    void Enqueue(int n)
    {
        if (rear >= a.length-1) 
        {
            System.out.println("Overflow");
        }
        else{
            rear++;
            a[rear] = n;
            if (front == -1) 
            {
                front=0;    
            }
        }
    }

    int Dequeue()
    {
        if (front == -1) 
        {
            System.out.println("Underflow");    
            return -1;
        }
        else
        {
            int y = a[front];
            if (front == rear) 
            {
                front = -1;
                rear = -1;    
            }
            else
            {
                front++;
            }
            return y;
        }
    }

    void display()
    {
        
        if (front == -1) 
        {
            System.out.println("Underflow");
            return;    
        }
        for(int i=front;i<=rear;i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }
}

public class A50 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Queue: ");
        int size = sc.nextInt();
        Queue q = new Queue(size);
        int num = 0;
        while (true) 
        {
            System.out.println("1:Enqueue");
            System.out.println("2:Dequeue");
            // System.out.println("3:Display");
            // System.out.println("4:Exit");
            System.out.println();
            System.out.print("Enter Choice: ");
            int c = sc.nextInt();
        
            switch (c) 
            {
                case 1:
                    System.out.print("Enter value to Insert: ");
                    num = sc.nextInt();
                    q.Enqueue(num);
                     q.display();
                    break;
                case 2:
                    System.out.println("Deleted Element: "+q.Dequeue());
                     q.display();
                    break;
                
            }
        }
    }
}
