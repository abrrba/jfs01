class MainLinkedList
{
public static void main(String args[])
{
LinkedList x=new LinkedList();
ListNode head=new ListNode(11);
x.addAtHead(head);
//x.addAtHead(11);
x.addAtHead(new ListNode(22));
x.addAtHead(new ListNode (33));
x.addAtHead(new ListNode (44));
x.addAtHead(new ListNode (55));
//x.reverse(head);
ListNode reverseNode=x.reverse(head);
//x.reverse(head)=hh;
x.printlist(reverseNode);
}
}
