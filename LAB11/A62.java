public class A62
{
	class Node
	{
		int info;
		Node link;

		Node(int info)
		{
			this.info=info;
			this.link=null;
		}
	}
	Node first = null;
	void insertAtLast(int info)
	{
		Node newnode = new Node(info);
		
			if(first==null)
			{
				first=newnode;
				return;
			}
			else
			{
				Node save = first;
				while(save.link!=null)
				{
					save=save.link;
				}
				save.link=newnode;
			}
	}
	void deleteduplicate()
	{
		Node i=first;
		while(i.link!=null)
		{
			Node j=i;
			Node pre=null;
			while(j.link!=null)
			{
				pre=j;
				j=j.link;
				
				if(i.info==j.info)
				{
					pre.link=j.link;
				}
			}
			i=i.link;
		}
	}
void display() {
        Node save = first;
        while (save != null) {
            System.out.print(save.info + " ");
            save = save.link;

        }
       }
public static void main(String[] args) 
	{
		A62 l1=new A62();
		l1.insertAtLast(1);
		l1.insertAtLast(2);
		l1.insertAtLast(1);
		l1.insertAtLast(3);
		l1.insertAtLast(4);
		l1.insertAtLast(5);
		l1.insertAtLast(5);
		l1.insertAtLast(4);
		l1.insertAtLast(8);
		l1.insertAtLast(3);
		l1.insertAtLast(9);
		l1.insertAtLast(3);
		l1.deleteduplicate();
		l1.display();
	}
}