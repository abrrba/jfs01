class LinkedList
{
	private ListNode head;

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

	public void oddeven()
	{
//		LinkedList y=new LinkedList();
//		LinkedList z=new LinkedList();
		ListNode temp=head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext(); 
			if((temp.getData()%2)==0)
			{
		
			System.out.println("even number" + temp.getData());
		
			}
			else if((temp.getData()%2)!=0)
			{
			
			System.out.println("odd number" + temp.getData());
			
			}
		}
	}

	public void printAll(){
		ListNode temp1=head;
		while(temp1.getNext()!=null)
		{
			temp1=temp1.getNext();
			System.out.println(temp1.getData());
		}
	}





}
