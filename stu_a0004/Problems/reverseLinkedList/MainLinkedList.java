class MainLinkedList
{
	public static void main(String args[])
	{
		LinkedList x=new LinkedList();
		LinkedList y=new LinkedList();
		x.addAtTail(1);
		x.addAtTail(2);
		x.addAtTail(3);
		x.addAtTail(4);
		x.addAtTail(5);
		System.out.println("The Linked List is = ");
		x.printAll();
		for(int i=0;i<5;i++)
		{
			y.addAtHead(x.delFromHead());
		}
		System.out.println("\nThe reverse Linked List is = "); 
		y.printAll();
	}
}
