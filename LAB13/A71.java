// 71. Write a menu driven program to implement following operations on the
// circular linked list.
//  Insert a node at the front of the linked list.
//  Delete a node from specified position.
//  Insert a node at the end of the linked list.
//  Display all nodes.

import java.util.Scanner;

public class A71{
    Node first;
    Node last;

    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }
    public void insertAtFirst(int data)
    {
    	Node newNode = new Node(data);

    	if(first==null)
    	{
    		first=newNode;
    		last=newNode;
    		first.link=newNode;
    		return;
    	} 

    	newNode.link=first;
    	first=newNode;
    	last.link=newNode;
    }

    public void insertAtLast(int data)
    {
    	Node newNode = new Node(data);

    	if(first==null)
    	{
    		first=newNode;
    		last=newNode;
    		first.link=newNode;
    		return;
    	} 
    	Node save=first;

    	while(save!=last)
    	{
    		save=save.link;
    	}

    	save.link=newNode;
    	last=newNode;
    	last.link=first;
    }

    public void Delet(int data)
    {
    	if(first==null)
    	{
    		System.out.println("empty");
    	}
    	Node current=first;
    	Node pervious=null;

    	if(current.info==data)
    	{
    		first=current.link;
    		last.link=first;
    		return;
    	}

    	while(current.info!=data && current!=null){
    		pervious=current;
    		current=current.link;
    	}

    	pervious.link=current.link;

    	if(current==last)
    	{
    		pervious=last;
    		last.link=first;
    	}
    }


    public void printlist()
    {
    	Node node=first;

    	while(node!=last){
    		System.out.print(node.info +"->");
    		node=node.link;
    	}
    	System.out.print(last.info);
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);

    	A71 list=new A71();

    	list.insertAtFirst(2);
    	list.insertAtFirst(5);
    	list.insertAtFirst(4);
    	list.insertAtFirst(8);
    	list.insertAtLast(10);
    	list.insertAtLast(15);
    	

    	list.printlist();

    }
 }

