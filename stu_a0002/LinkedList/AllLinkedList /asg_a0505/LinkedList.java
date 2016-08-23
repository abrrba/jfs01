class LinkedList
{
private ListNode head;

LinkedList()
{
head=null;
}

public void addAtHead(ListNode node)
{
if(head==null)
{
head=node;
head.setNext(null);
}
else
{
ListNode temp=node;
temp.setNext(head);
temp=head;
}
}

public ListNode reverse(ListNode currentNode){
ListNode prevNode=null;
ListNode nextNode;
while(currentNode.getNext()!=null)
{
nextNode=currentNode.getNext();
currentNode.setNext(prevNode);
prevNode=currentNode;
currentNode=nextNode;
}
return prevNode;
}



public void printlist(ListNode head)
{
ListNode temp=head;
while(temp!=null)
{
temp=temp.getNext();
System.out.println(temp.getData());
}
System.out.println();
}
}
