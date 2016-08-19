class LinkedList
{
	ListNode head;

	LinkedList()
	{
		head=null;
	}
	public void addAtHead(int data)
	{
		if(head==null)
		{
			head=new ListNode(data);
		}
		else
		{
			ListNode temp=new ListNode(data);
			temp.setNext(head);
			head=temp;
		}
	}
	public void addAtTail(int data)
	{
		if(head==null)
		{
			head=new ListNode(data);
			head.setNext(null);
		}
		else
		{
			ListNode tail=new ListNode(data);
			ListNode temp=head;
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(tail);
			tail.setNext(null);
		}
	}

	public int delFromHead()
	{
		if(head==null)
		{
			System.out.println("LinkedList is Empty");
			return 0;
		}
		else if(head.getNext()==null)
		{
			ListNode temp=head;
			head=null;
			return temp.getData();
		}
		else
		{
			ListNode temp=head;
			head=head.getNext();
			return temp.getData();
		}
	}


	public void printAll()
	{
		ListNode temp=head;
		if(head==null)
		{
			System.out.println("Linked List is Empty");
		}
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.getData());
				temp=temp.getNext();
			}
		}
	}
}
