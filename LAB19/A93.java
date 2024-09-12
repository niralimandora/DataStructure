// Write a program to implement a bubble sort using Array.
import java.util.Scanner;
class A93 {
  public static void Insertionsort(int size, int[] array) 
    {
        
       int n=array.length;
       for(int j=1;j<n;j++)
       {
        int key = array[j];
        int i=j-1;
        while((i>-1)&&(array[i]>key))
         {
            array[i+1]=array[i];
            i--;
         }
         array[i+1]=key;
       }
      
    }
  

  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    //class object function call
    A93 ob = new A93();

    //array
    System.out.println("enter a array of size");
    int size=sc.nextInt();
    int array[]=new int[size];
    for(int i=0;i<array.length;i++)
      {
        System.out.print("enter element-");
        array[i]=sc.nextInt();
      }

    Insertionsort(size,array);

    System.out.println("after sorted");
    for(int i=0;i<array.length;i++)
    {
      System.out.print(array[i]+" ");
    }  
  }
}