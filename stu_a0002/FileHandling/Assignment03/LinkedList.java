class LinkedList
{
private ListNode head;

LinkedList()
{
head=null;
}

public void  addAtTail(int id,String pos,String color,int marks,String subject,int physics,int chem,int math)
{
if(head==null)
{
head=new ListNode(id,pos,color,marks,subject,physics,chem,math);
head.setNext(null);
}
else
{
ListNode Tail=new ListNode(id,pos,color,marks,subject,physics,chem,math);
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
System.out.println("Id ="+temp.getId()+ " Position ="+temp.getPos()+" Color ="+temp.getColor()+" Marks ="+temp.getMarks()+" Subject ="+temp.getSubject()+" Physics marks"+temp.getPhysicsMarks()+" Chemistry marks "+temp.getChemMarks()+" Math Marks"+temp.getMathMarks());

temp=temp.getNext();
}
}
}
}
