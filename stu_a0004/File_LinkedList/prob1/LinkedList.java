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
while(temp.getNext() !=null)
{
temp=temp.getNext();
}
temp.setNext(tail);
tail.setNext(null);
}
}

public void printAll()
{
if(head==null)
{
System.out.println("LinkedList is Empty");
}
else
{
ListNode temp=head;
while(temp!=null)
{
System.out.println(temp.getData());
temp=temp.getNext();
}
}
}
}
