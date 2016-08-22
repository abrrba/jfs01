import java.util.Iterator;
import java.util.*;

class LinkedList { 
	private ListNode head; 

	LinkedList () {    
		head = null;   
	}

	public int addAtHead (int data) {   
		if (head == null) {
			head = new ListNode (data);
			head.setNext(null);
			return 0;
		} else {
			ListNode temp = new ListNode (data);
			temp.setNext(head);
			head = temp;
			return 0;
		}
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

