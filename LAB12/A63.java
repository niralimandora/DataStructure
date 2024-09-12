import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    void append(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
    }

    // Method to print the linked list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to copy the linked list
    LinkedList copy() {
        LinkedList copiedList = new LinkedList();
        if (this.head == null) {
            return copiedList;
        }

        // Copy the head node
        copiedList.head = new Node(this.head.data);
        Node originalCurrent = this.head;
        Node copiedCurrent = copiedList.head;

        // Traverse the original list and copy each node
        while (originalCurrent.next != null) {
            originalCurrent = originalCurrent.next;
            copiedCurrent.next = new Node(originalCurrent.data);
            copiedCurrent = copiedCurrent.next;
        }

        return copiedList;
    }
}
public class A63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a linked list
        LinkedList linkedList = new LinkedList();

        // Prompt the user to enter elements for the linked list
        System.out.println("Enter elements for the linked list (enter -1 to stop):");
        while (true) {
            System.out.print("Enter element: ");
            int data = scanner.nextInt();
            if (data == -1) {
                break;
            }
            linkedList.append(data);
        }

        // Print the original list
        System.out.println("Original linked list:");
        linkedList.printList();

        // Copy the linked list
        LinkedList copiedList = linkedList.copy();

        // Print the copied list
        System.out.println("Copied linked list:");
        copiedList.printList();

        // Close the scanner
        scanner.close();
    }
}
