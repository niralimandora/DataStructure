// Write a program to implement a bubble sort using Array.
import java.util.Scanner;
class A92 {
  public static void bubblesort(int size, int[] array) 
    {
        int temp=0;
        int swap=0;
        for(int i=0;i<size-1;i++)
        {
          for(int j=0;j<size-i-1;j++)
          {
              if(array[j]>array[j+1])
              {
                temp=array[j+1];
                array[j+1]=array[j];
                array[j]=temp;
                swap++;
              }
              
          }
        }
        if(swap==0)
        {
          System.out.println("already sorted");
        }
      
    }
  

  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    //class object function call
    A92 ob = new A92();

    //array
    System.out.println("enter a array of size");
    int size=sc.nextInt();
    int array[]=new int[size];
    for(int i=0;i<array.length;i++)
      {
        System.out.print("enter element-");
        array[i]=sc.nextInt();
      }

    bubblesort(size,array);

    System.out.println("after sorted");
    for(int i=0;i<array.length;i++)
    {
      System.out.print(array[i]+" ");
    }  
  }
}