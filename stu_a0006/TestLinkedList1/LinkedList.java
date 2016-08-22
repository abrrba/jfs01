import java.*;
class LinkedList
{
	private ListNode head;
	LinkedList()
	{
		head=null;
	}

	public void addAtSortedAcc(int data)
	{
		ListNode temp=new ListNode(data);
		if(head==null)
		{ 
			//head=new ListNode(data);
			temp.setNext(null);
			head=temp;

			
		}
		else if(temp.getdata()<=head.getdata())
			{
				temp.setNext(head);
				
				head=temp;
				
			}

			else
			{
				ListNode temp1=head;
				ListNode temp2=head.getNext();
				if(temp1.getNext()==null)
				{
					temp1.setNext(temp);
					temp.setNext(null);
				}

				else
				{
					while(temp1.getdata()<temp.getdata()&& temp2.getNext()!=null)
					{
						if(temp1.getdata()<temp.getdata()&&temp2.getdata()<temp.getdata())
						{
							temp1=temp1.getNext();
							temp2=temp2.getNext();
						}
						else if(temp1.getdata()<temp.getdata()&&temp2.getdata()>temp.getdata())
						{
							break;
						}
					}
					if(temp2.getNext()==null&&temp2.getdata()<temp.getdata())
					{
						temp2.setNext(temp);
						temp.setNext(null);
					}
					else if(temp1.getdata()<temp.getdata() &&temp2.getdata()>temp.getdata())
					{
						temp1.setNext(temp);
						temp.setNext(temp2);
					}

					
				}

			}
	
}


public void printAll()
{
	if(head==null)
	{
		System.out.println("LinkedList is empty");
	}
	else
	{
		ListNode temp=head;
		while(temp.getNext()!=null)
		{
			System.out.print(" "+temp.getdata()+ " ");

			temp=temp.getNext();
		}
              System.out.println(temp.getdata());
	}
}
}


