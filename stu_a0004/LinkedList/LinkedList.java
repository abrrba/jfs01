/*
 * Linked List Program 2
= * int addAtHead		(int data) - add at head.
= * int addAtTail		(int data) - add at tail.
= * int addAtMiddle 		(int data, int node) - add at middle.
= * int delFromHead		(void) - delete from head.
= * int delFromTail 		(void) - delete from tail.
= * int delFromMiddle		(int node) - delete from middile based on node number.
 * int addSorted	 	(int data) - add the nodes in a sorted fashion.
= * int printAll 		(void) - print all the nodes.
 * int reverse 			(ll listrev) - Reverse a linked list
 * int reverseThreePointer 	(void) - reverse using 3 pointer method.
 * int sortList			(void) - sort the linked list
 * int merge			(ll listrev, ll listmerge) - Merge two linked list - add the head of a linked list to the tail of another
 * int split			(ll liste, ll listo) - split the linked list based on node number. Even list and odd list.
 * int split			(void) - split the nodes based on the node value. Even list and odd list.
= * int search 			(int) - search a node based on the value
= * int delValue			(int) - Delete a node based on the value - basically search and delete
= * int getElement		(void) - Get the number of elements in the linkedList'
 * int getElements		(int array[]) - Get all the elements in an array. What will happen if there are 1000K elements in the linked list and passed array is of length 10K.
 * int getElements		(int vector[]) - Get the elements in a vector. Is the above case valid here.
 * int reverseThreePointer 	(void) - reverse using 3 pointer method.
 * int mergeAscending 		(void) - Merge two linked list, the code should add the nodes in a ascending order
 * int mergeDesecnding 		(void) - Merge two linked list, the code should add the nodes in desecnding  order
 */

import java.util.*;

class LinkedList {  // Implement a new class

private ListNode head; // Private head - why? - 

  LinkedList () {     // Construtor
      head = null;    // head should be null - Why?
  }

  public int addAtHead (int data) {   // Add at head 
      if (head == null) {
          head = new ListNode (data);
          head.setNext(null);     // Setting head's next as null - why?
          return 0;
      } else {
          ListNode temp = new ListNode (data);
          temp.setNext(head);
          head = temp;
          return 0;
      }
  }


public int addAtTail(int data){
ListNode tail=new ListNode(data);
ListNode temp=head;
while(temp.getNext() !=null)
{
temp=temp.getNext();
}
temp.setNext(tail);
tail.setNext(null);
return 0;
}

public int addAtMiddle(int data ,int node){
ListNode mid=new ListNode(data);
ListNode temp=head;
for(int i=0;i<node-1 && temp.getNext() !=null;i++)
{
temp=temp.getNext();
}
ListNode temp1=temp.getNext();
//temp2=temp1.getNext();
temp.setNext(mid);
mid.setNext(temp1);
return 0;
}

public int delFromHead(){
head=head.getNext();
return 0;
}

public int delFromTail(){
ListNode temp=head; 
ListNode temp1=temp.getNext();

while(temp1.getNext()!=null)
{
temp=temp.getNext();
temp1=temp1.getNext();
}
temp.setNext(null);
return 0;
}

public void delFromMiddle(int node){
ListNode temp=head;
for(int i=0;i<node-1&& temp.getNext()!=null ;i++)
{
temp=temp.getNext();
}
ListNode temp1=temp.getNext();
ListNode temp2=temp1.getNext();
temp.setNext(temp2);
}


public void search(int node){
ListNode temp=head;
while(temp.getNext()!=null)
{
if(temp.getData()==node)
{
System.out.println("The " + node +" value is present in linked list");
}
temp=temp.getNext();
}
}



public void delValue(int node){
ListNode temp=head;
int count=1;
while(temp.getNext()!=null)
{
if(temp.getData()==node)
{
break;
}
count++;
temp=temp.getNext();
}
temp=head;
for(int i=0;i<count-2 && temp.getNext()!=null;i++)
{
temp=temp.getNext();
}
ListNode temp1=temp.getNext();
ListNode temp2=temp1.getNext();
temp.setNext(temp2);
}
//System.out.println(count);

public void getElement()
{
ListNode temp=head;
int count=0;
while(temp!=null)
{
temp=temp.getNext();
count++;
}
System.out.println(count);
}

/*
public void split(){
ListNode temp=head;
while(temp.getNext()!=null)
{
temp=temp.getNext();
if(temp.getData()%2==0)
{
System.out.print(temp.getData()+",");
continue;
}
if(temp.getData()%2!=0)
{
System.out.print(temp.getData()+ ",");
}

}}

*/



   public void printAll () {
        if (head == null) {
            System.out.println("Unable to print as LinkList is empty\n");
        } else {
            ListNode temp = head;
            while (true) {
                System.out.print ( " " + temp.getData() + " ");
                temp = temp.getNext();
                if (temp == null) {
                    break;
                }
            }
        }
    }
	
}



