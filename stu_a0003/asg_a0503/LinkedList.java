class LinkedList{
	private ListNode head;

	LinkedList(){
		head=null;
	}

	public int addAtHead(int data)
	{
		if(head==null)
		{
			head=new ListNode (data);
			head.setNext(null);
			return 0;
		}
		else
		{
			ListNode temp=new ListNode(data);
			temp.setNext(head);
			head=temp;
			return 0;
		}
	}

	public void ssl_disp_fwd(int n)
	{
		ListNode temp=head;
		for(int i=0 ; i<n ; i++)
		{
			temp=temp.getNext();
		
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
			System.out.println(temp.getData());
		}}
	}
}
