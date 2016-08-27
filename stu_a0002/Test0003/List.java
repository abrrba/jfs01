class LList
{

	Node head;

	LList()
	{
		head=null;
	}

	public void addAtHead(int data)
	{
		if(head==null)
		{
			head=new Node(data);
			head.setNext(null);
		}
		else
		{
			Node temp=new Node(data);
			temp.setNext(head);
			head=temp;
		}
	}
	public void addAtMiddle(int num,int size)
	{
		Node node=new Node(num);
		Node temp=head;
	
		if(head==null )
		{
		
			head=new Node(num);
			head.setNext(null);
		}

		else if(temp.getNext()==null)
		{
			temp.setNext(node);
			node.setNext(null);
		}
		else
		{
			Node temp1=head.getNext();
			int number=size;
			int y=number/2;	
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
			System.out.println("LList empty");
			return 0;
		}
		else if(head.getNext()==null)
		{
			Node temp=head;
			head=null;
			return temp.getData();
		}
		else
		{
			Node temp=head;
			head=head.getNext();
			return temp.getData();
		}
	}
	public void addAtTail(int data)
	{
		if(head==null)
		{
			head=new Node(data);
			head.setNext(null);
		}
		else
		{
			Node tail=new Node(data);
			Node temp=head;
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
		Node temp=new Node(data);
		if(head==null)
		{
			temp.setNext(null);
			head=temp;
		}
		else if(temp.getData()<=head.getData())
		{
			temp.setNext(head);
			head=temp;
		}
		else
		{
			Node position1=head;
			Node position2=head.getNext();

			if(position1.getNext()==null)
			{
				position1.setNext(temp);
				temp.setNext(null);
			}
			else
			{
		while(temp.getData()>=position1.getData()&& position2.getNext()!=null)
				{
	if(temp.getData()>=position1.getData() && temp.getData()>=position2.getData())
					{
						position1=position1.getNext();
						position2=position2.getNext();
					}
 else if(temp.getData()>=position1.getData() && temp.getData()<=position2.getData())
					{
						break;
					}
				}

				if(position2.getNext()==null && temp.getData()>=position2.getData())
				{
					position2.setNext(temp);
					temp.setNext(null);
				}
				else if(temp.getData()>=position1.getData() && temp.getData()<=position2.getData())
				{
					position1.setNext(temp);
					temp.setNext(position2);
				}
			}
		}
	}
	public void printAll(int number)
	{
		if(head==null)
		{
			System.out.println("LList Empty");
		}
		else
		{
			Node temp=head;
			while(temp.getNext()!=null)
				//	for(int i=0;i<total;i++)
			{
				System.out.print(" " +temp.getData()+" ");
							temp=temp.getNext();
			}
			System.out.println(temp.getData());
		}
	}
}
