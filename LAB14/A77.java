import java.util.Scanner;

public class A77 {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int x){
            this.data = x;
            this.left = null;
            this.right = null;
        }
    }
    Node Insert(Node root , int val){
        if(root ==null){
            root = new Node(val);
            return root;
        }
        else if(val<root.data){
            // System.out.println("left");
            root.left = Insert(root.left , val);
        }
        else{
            // System.out.println("right");
            root.right = Insert(root.right,val);
        }
        return root ;
    }
    void preOrder(Node root){
       if(root == null){
            return;
       }
         System.out.print(root.data+" ");
         preOrder(root.left);
         preOrder(root.right);
    }

    void InOrder(Node root){
        if(root == null){
             return;
        }
          
          InOrder(root.left);
          System.out.print(root.data+" ");
          InOrder(root.right);
     }
     void PostOrder(Node root){
        if(root == null){
             return;
        }
          
          PostOrder(root.left);
          PostOrder(root.right);
          System.out.print(root.data+" ");
     }

     public Node Delete(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.data) 
        {
            root.left = Delete(root.left, key);
        }
        else if (key > root.data) 
        {
            root.right = Delete(root.right, key);
        } 
        else 
        {
            if (root.left == null) 
            {
                return root.right;
            } 
            else if (root.right == null) 
            {
                return root.left;
            }

            root.data = InorderSucc(root.right);
            root.right = Delete(root.right, root.data);
        }
        return root;
    }
    int InorderSucc(Node root)
    {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
         return min;
    }

    
     
    public static void main(String[] args) {
        A77 l= new A77();
        // int a[] = {

        //     3,5,9,2,1
        // };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element : ");
            a[i] = sc.nextInt();
        }
        Node root = null ;
        for(int i = 0 ; i<a.length ; i++){
            root = l.Insert(root, a[i]);
        } 
        // l.PostOrder(root);
        // System.out.println("");
        // l.InOrder(root);
        l.InOrder(root);
        System.out.print("Enter the value to delete : ");
        int n1 = sc.nextInt();
        l.Delete(root, n1);
        System.out.println("");
        l.InOrder(root);
        sc.close();
    }
}
