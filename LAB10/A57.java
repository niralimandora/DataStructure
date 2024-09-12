//Accessing singly linked list

import java.util.Scanner;

//MAIN METHOD 
public class A57 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Create an object
        LinkedListOperations list = new LinkedListOperations();

        //Choice fro operation
        System.out.println("Insert at start: 1");
        System.out.println("Insert at end: 2");
        System.out.println("Insert in order: 3");
        System.out.println("Delete: 4");
        System.out.println("Count nodes: 5");
        System.out.println("Copy linked list: 6");
        System.out.println("Reverse linked list: 7");
        System.out.println("Sort linked list: 8");
        System.out.println("Exit: 0");

        System.out.println();

        while(true) {

                     
        
            System.out.print("Enter opertation choice:");
            int num = sc.nextInt();

            switch (num) {
                case 1: //Start
                    System.out.print("Enter element at start:");
                    int ele_1 = sc.nextInt();
                    list.insertAtStart(ele_1);
                    list.printList();
                    break;

                case 2: //End
                    System.out.print("Enter element at end:");
                    int ele_2 = sc.nextInt();
                    list.insertAtEnd(ele_2);
                    list.printList();
                    break;

                case 3: //Order 
                    System.out.print("Enter element in order:");
                    int ele_3 = sc.nextInt();
                    list.insertInOrder(ele_3);
                    list.printList();
                    break;

                case 4: //Delete
                    System.out.print("Enter element to be deleted:");
                    int ele_4 = sc.nextInt();
                    list.delete(ele_4);
                    list.printList();
                    break;

                case 5: //Count
                    int ans;
                    ans = list.countNode();
                    System.out.println("No. of node = " + ans);
                    break;

                case 6: //Copy
                    LinkedListOperations new_list = list.copyLinkedList();
                    System.out.print("Copied list: ");
                    new_list.printList();
                    break;

                case 7: //Reverse
                    System.out.print("Reversed: ");
                    list.reverseLinkedList();
                    list.printList();
                    break;

                case 8: //Sort
                    System.out.print("Sorted: ");
                    list.sortLinkedList();
                    list.printList();
                    break;

                case 0: //Fianl print & exit
                    System.out.print("Final linked list: ");
                    list.printList();
                    sc.close();
                    System.exit(0);
            
                default:
                    System.out.println("Enter a valid operation choice!!");
                    break;
            }
            System.out.println(); //Blank line
       }
   }
}
