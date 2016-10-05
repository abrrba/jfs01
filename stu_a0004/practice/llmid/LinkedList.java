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
temp=head;
}
}

public void printAll()
{
ListNode temp=head;
while(temp.getNext()!=null)
{
System.out.println(temp.getData()+"fd");
temp=temp.getNext();
}
}

}

