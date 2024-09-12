// Write a program to implement a Binary Search using Array.
import java.util.Scanner;
class A91 {
  int binarySearch(int array[], int x, int low, int high) {

    // Repeat until the pointers low and high meet each other
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (array[mid] == x)
        return mid;

      if (array[mid] < x)
        low = mid + 1;

      else
        high = mid - 1;
    }

    return -1;
  }

  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    //class object function call
    A91 ob = new A91();

    //array
    System.out.println("enter a array of size");
    int a=sc.nextInt();
    int array[]=new int[a];
    for(int i=0;i<array.length;i++)
      {
        System.out.print("enter element-");
        array[i]=sc.nextInt();
      }

    //high index
    int n = array.length;

    System.out.println("choose your elment");
    int x = sc.nextInt();

    //pass perameter
    int result = ob.binarySearch(array, x, 0, n - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
}