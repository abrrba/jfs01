class ListNode
{
private ListNode next;
private int data;

ListNode(int val){
data=val;
next=null;
}

public void setData(int val)
{
data=val;
}

public int getData()
{
return data;
}

public void setNext(ListNode n)
{
next=n;
}

public ListNode getNext()
{
return next;
}
}
