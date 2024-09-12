import java.util.Scanner;

public class A77
{
	class Node
	{
		int key;
		node left;
		node right;

	public Node(int data);
		{
			key = data;
			left = null;
			right = null;
		}
	}

	public Node insertRecord(Node root,int data)
	{
		if(root == null)
		{
			root = new Node(data);
			return root;
		}
		if(data<root.key)
		{
			root.letf = insertRecord(root.left,data);
		}
		else if(data>root.key)
		{
			root.right = insertRecord(root.right,data);
		}

		return root;
	}
	public class BinarySearchTree
	{
		Node root;
	public BinarySearchTree()
	{
		root = null;
	}

	void insert(int data)
	{
		root = insertRecord(root,key);
	}
	}
	
}

	
