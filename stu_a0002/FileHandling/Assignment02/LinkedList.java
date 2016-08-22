class LinkedList
{
private ListNode head;

LinkedList()
{
head=null;
}

public void  addAtTail(int id,String pos,String color,int marks,String subject)
{
if(head==null)
{
head=new ListNode(id,pos,color,marks,subject);
head.setNext(null);
}
else
{
ListNode Tail=new ListNode(id,pos,color,marks,subject);
ListNode temp=head;
while(temp.getNext()!=null)
{
temp=temp.getNext();
}
temp.setNext(Tail);
Tail.setNext(null);
}
}

public void printAll()
{
if(head==null)
{
System.out.println("Empty Linked List");
}
else
{
ListNode temp=head;
while(temp.getNext()!=null)
{
System.out.println("Id ="+temp.getId()+ " Position ="+temp.getPos()+" Color ="+temp.getColor()+" Marks ="+temp.getMarks()+" Subject="+temp.getSubject());

temp=temp.getNext();
}
}
}
}
