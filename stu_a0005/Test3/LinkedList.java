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
			head.setNext(null);
		}
		else
		{
			ListNode temp=new ListNode(data);
			temp.setNext(head);
			head=temp;
		}
	}
	public int delFromHead()
	{
		if(head==null)
		{
			System.out.println("linkedList is empty");
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


	public void Addsorted(int data)
	{
		ListNode temp=new ListNode(data);
		if(head==null)
		{
			temp.setNext(null);
			head = temp;
		}
		else if(temp.getData() <= head.getData())
		{
			temp.setNext(head);
			head = temp;
		}
		else
		{
			ListNode currunt = head;
			ListNode next = head.getNext();

			if(currunt.getNext() == null)
			{
				currunt.setNext(temp);
				temp.setNext(null);
			}
			else
			{
				while(temp.getData() >= currunt.getData() && next.getNext() != null)
				{
					if(temp.getData() >= currunt.getData() && temp.getData() >= next.getData())
					{
						currunt = currunt.getNext();
						next = next.getNext();
					}
					else if(temp.getData() >= currunt.getData() && temp.getData() <= next.getData())
					{
						break;
					}
				}

				if( next.getNext() == null && temp.getData() >= next.getData())
				{
					next.setNext(temp);
					temp.setNext(null);
				}
				else if( temp.getData() >= currunt.getData() && temp.getData() <= next.getData())
				{
					currunt.setNext(temp);
					temp.setNext(next);
				}
			}
		}
	}


	public void printAll(int x)
	{
		if( head == null )
		{
			System.out.println(" Empty LinkList");
		}
		else
		{
			ListNode temp=head;
			while(temp.getNext()!=null)

			{
				System.out.print(" " +temp.getData()+" ");

				temp = temp.getNext();
			}
			System.out.println(temp.getData());
		}
	}
}

