public class A98 {
    void BuildMaxHeap(int a[],int n)
    {   
        for (int i = n/2-1; i >= 0; i--) {
            Heapify(a, n, i);
        }
    }

    void Heapify(int a[],int n,int i)
    {
        int max = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if (left<n && a[left]>a[max] ) {
            max = left;
        }
        if (right<n && a[right]>a[max]) {
            max = right;
        }

        if (i!=max) 
        {
            int temp = a[i];
            a[i] = a[max];
            a[max] = temp;
            Heapify(a, n, max);
        }
        
    }

    public static void main(String[] args) {
        int a[] = {5,6,4,7,9,8,3};

        A98 s = new A98();
        int n = a.length;

        s.BuildMaxHeap(a,n);

        for (int i = n-1; i >0; i--) //6 5 4 3 2 1 0
        {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            s.Heapify(a, i, 0);    
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
 }
}
}
