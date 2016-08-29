class ListNode
{
private int data;
private ListNode Next;
ListNode(int val)
{
data=val;
Next=null;
}
public void setdata(int val)
{
data=val;
}
public int getdata()
{
return data;
}
public void setNext(ListNode n)
{
Next=n;
}
public ListNode getNext()
{
return Next;
}
}
