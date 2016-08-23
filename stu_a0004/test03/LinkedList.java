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
	public void addAtMiddle(int num,int size)
	{
		ListNode node=new ListNode(num);;
		ListNode temp=head;
	//	ListNode temp1=head.getNext();
		if(head==null )
		{
		
			head=new ListNode(num);
			head.setNext(null);
		}

		else if(temp.getNext()==null)
		{
			temp.setNext(node);
			node.setNext(null);
		}
		else
		{
			ListNode temp1=head.getNext();
			int x=size;
			int y=x/2;	
			for(int i=0;i<y&&temp.getNext()!=null;i++)
			{
				if(temp1.getNext()==null)
				{
					break;
				}
				else if(y==1)
				{
				break;
				}
				else
				{
					temp=temp.getNext();
					temp1=temp1.getNext();
				}
			}
			temp.setNext(node);
			node.setNext(temp1);
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

	public void compareHead(int data)
	{
		ListNode temp=new ListNode(data);
		if(head==null)//add 12
		{
			temp.setNext(null);
			head=temp;//head at 12
		}
		else if(temp.getData()<=head.getData())
		{
			temp.setNext(head);
			head=temp;//head is at 9 ll 9-12
		}
		else
		{
			ListNode point1=head;
			ListNode point2=head.getNext();

			if(point1.getNext()==null)
			{
				point1.setNext(temp);
				temp.setNext(null);
			}
			else
			{
		while(temp.getData()>=point1.getData()&& point2.getNext()!=null)
				{
	if(temp.getData()>=point1.getData() && temp.getData()>=point2.getData())
					{
						point1=point1.getNext();
						point2=point2.getNext();
					}
 else if(temp.getData()>=point1.getData() && temp.getData()<=point2.getData())
					{
						break;
					}
				}

				if(point2.getNext()==null && temp.getData()>=point2.getData())
				{
					point2.setNext(temp);
					temp.setNext(null);
				}
				else if(temp.getData()>=point1.getData() && temp.getData()<=point2.getData())
				{
					point1.setNext(temp);
					temp.setNext(point2);
				}
			}
		}
	}
	public void printAll(int x)
	{
		if(head==null)
		{
			System.out.println("linkedList is Empty");
		}
		else
		{
			ListNode temp=head;
			while(temp.getNext()!=null)
				//	for(int i=0;i<m;i++)
			{
				System.out.print(" " +temp.getData()+" ");
				//	System.out.println("check");
				temp=temp.getNext();
			}
			System.out.println(temp.getData());
		}
	}
}

