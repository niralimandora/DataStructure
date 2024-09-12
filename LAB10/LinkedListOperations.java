//Singly linked list methods

class LinkedListOperations {

    //Global variable for first node of linked list
    Node first;

    //Create a node 
    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    //1: Insert element at start 
    public void insertAtStart(int data) {

        //Creat a new node
        Node newNode = new Node(data);

        //Check if the linked list empty, then new node will be the first node
        if(first == null) {
            first = newNode;
            return;
        }

        //Or insert the node at first
        newNode.link = first;
        first = newNode;
        // Node temp = first;
        // first = newNode;
        // first.link = temp;
    }
 
    //2: Insert element at end 
    public void insertAtEnd(int data) {

        //Creat a new node
        Node newNode = new Node(data);

        //Check if the linked list empty, then new node will be the first/last node
        if(first == null) {
            first = newNode;
            return;
        }

        //Or insert the node at end
        Node save = first; //Refrence node
        while(save.link != null) { //Here 'save.link = null' means the last node is not included 
            save = save.link; //Move the save pionter ahead
        }
        save.link = newNode;
    }

    //3: Insert element in order(ascending) 
    public void insertInOrder(int data) {

        //Creat a new node
        Node newNode = new Node(data);

        //Check if the linked list empty or data of new is less then the data of first node, then new node will be the first node
        if(first == null || newNode.info <= first.info) {
            newNode.link = first;
            first = newNode; // New node becomes first node
            return;
        }

        //Or insert the node in order
        Node save = first; //Refrence node
        while(save.link != null && newNode.info >= save.link.info) { //Here 'save.link = null' means the last node is not included 
            save = save.link; //Move the save pionter ahead
        }
        newNode.link = save.link; //Always set the new node first
        save.link = newNode;
    }

    //4: Delete element 
    public void delete(int data) {

        //No need to creat a new node

        //Check if linked list is empty
        if(first == null) {
            System.out.println("Linked list is empty!!");
            return;
        }

        Node current = first; //Refrence node
        Node previous = null; //For previous node

        //Check if first node is to be deleted
        if(current.info == data) {
            first = current.link;
            return;
        }

        //Check for the data to be deleted, and keep track of previous node as we need to change save.link
        while(current.info != data && current != null) { 
            previous = current;
            current = current.link; //Move the save pionter ahead
        }

        //If data is not present in the linked list
        if(current == null) {
            System.out.println("Node not found!!");
            return;
        }

        //Unlink the node from the linked list
        previous.link = current.link;
        
    }

    //5: Count the no. of nodes 
    public int countNode() {

        int count = 0;

        //Check if the linked list empty
        if(first == null) {
            return 0;
        }

        Node save = first; //Refrence node
        while(save != null) { //Here 'save = null' means the last node is included 
            save = save.link; //Move the save pionter ahead
            count++;
        }
        return count;
    }

    //6: Copy linked list 
    public LinkedListOperations copyLinkedList() {

        //Check if linked list is empty
        if(first == null) {
            System.out.println("Linked list is empty!!");
            return null;
        }

        LinkedListOperations copy = new LinkedListOperations();

        Node pointer = first;
        while(pointer != null) {
            copy.insertAtEnd(pointer.info);
            pointer = pointer.link; 
        }

        return copy;
    }

    //7: Reverse linked list 
    public void reverseLinkedList() {
        
        if(first == null) {
            System.out.println("Linked list is empty!!");
            return;
        }

        //Check if the linked list has only one element
        if(first.link == null) {
            return;
        }

        Node previous = first;
        Node current = first.link;

        while(current != null) {
            Node next = current.link;
            current.link = previous;

            //Update the positions
            previous = current;
            current = next;    
        }
        first.link = null;
        first = previous;


    }

    //8: Sort linked list
    public void sortLinkedList(){
        Node temp = first.link;
        Node save = first;

        for (int i=1; i<=countNode(); i++) {
            for (int j=1; j<=countNode()-i; j++) {
                if(save.info > temp.info) {
                    int data = save.info;
                    save.info = temp.info;
                    temp.info = data;
                }
                save = save.link;
                temp = temp.link;
            }   
            save = first;
            temp = first.link;
        }
    }

    //0: Display the linked list
    void printList() {
        Node node = first;
        // if() {

        // }
        while(node != null) { //Here 'node = null' means that the last node is also included
            System.out.print(node.info + " -> ");
            node = node.link;
        }
    }

}
