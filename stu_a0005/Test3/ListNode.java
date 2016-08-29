class ListNode
{
	private int data;
	private ListNode next;

	ListNode(int d)
	{
		data = d;
		next = null;
	}

	public void setData(int d)
	{
		data = d;
	}

	public int getData()
	{
		return data;
	}

	public void setNext(ListNode n)
	{
		next = n;
	}

	public ListNode getNext()
	{
		return next;
	}
}

