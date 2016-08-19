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
System.out.println("the linked List is empty");
}
else
{
ListNode temp=head;
while(temp.getNext()!=null)
{
System.out.println("the Id is="+temp.getId()+ " Position is="+temp.getPos()+" Color is="+temp.getColor()+" Marks Are="+temp.getMarks()+" Subject Name="+temp.getSubject()+" physics mark is "+temp.getPhysicsMarks()+" chem marks is "+temp.getChemMarks()+" Math Marks is "+temp.getMathMarks());
/*
System.out.println("the Position is" + temp.getPos());
System.out.println("the color is" + temp.getColor());
System.out.println("the Marks is" + temp.getMarks());
System.out.println("the Subject is" + temp.getSubject());
*/
temp=temp.getNext();
}
}
}
}
