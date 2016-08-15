import java.util.Iterator;
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
