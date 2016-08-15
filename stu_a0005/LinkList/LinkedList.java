/*
 * Linked List Program 2
 * int addAtHead		(int data) - add at head.
 * int addAtTail		(int data) - add at tail.
 * int addAtMiddle 		(int data, int node) - add at middle.
 * int delFromHead		(void) - delete from head.
 * int delFromTail 		(void) - delete from tail.
 * int delFromMiddle		(int node) - delete from middile based on node number.
 * int addSorted	 	(int data) - add the nodes in a sorted fashion.
 * int printAll 		(void) - print all the nodes.
 * int reverse 			(ll listrev) - Reverse a linked list
 * int reverseThreePointer 	(void) - reverse using 3 pointer method.
 * int sortList			(void) - sort the linked list
 * int merge			(ll listrev, ll listmerge) - Merge two linked list - add the head of a linked list to the tail of another
 * int split			(ll liste, ll listo) - split the linked list based on node number. Even list and odd list.
 * int split			(void) - split the nodes based on the node value. Even list and odd list.
 * int search 			(int) - search a node based on the value
 * int delValue(int) - Delete a node based on the value - basically search and delete
 * int getElement		(void) - Get the number of elements in the linkedList'
 * int getElements		(int array[]) - Get all the elements in an array. What will happen if there are 1000K elements in the linked list and passed array is of length 10K.
 * int getElements		(int vector[]) - Get the elements in a vector. Is the above case valid here.
 * int reverseThreePointer 	(void) - reverse using 3 pointer method.
 * int mergeAscending 		(void) - Merge two linked list, the code should add the nodes in a ascending order
 * int mergeDesecnding 		(void) - Merge two linked list, the code should add the nodes in desecnding  order
 */

import java.util.*;

class LinkedList {  // Implement a new class.
	private ListNode head; // Private head - why? - 

	LinkedList () {     // Construtor
		head = null;// head should be null - Why?

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

	public int addAtMiddle(int data, int position){
		//	  int position = 2;
		ListNode middle = new ListNode(data);
		ListNode previous = head;
		int count = 1;
		while(count < position - 1){
			previous = previous.getNext();
			count ++;
		}
		ListNode temp = previous.getNext();
		middle.setNext(temp);
		previous.setNext(middle);
		return 0;
	}



	public int addAtTail(int data){
		if(head == null){
			System.out.println("Linked list not found");
		}
		else{
			ListNode temp = head;
			while(true){
				temp = temp.getNext();
				if(temp == null){
					break;
				}
				ListNode tail = new ListNode(data);
				temp.setNext(tail);
				tail.setNext(null);
				temp = tail;
			}
		}
		return 0;
	}

	public void delFromHead(){
		if(head == null){
			System.out.println("List not found");
		}
		else{
			ListNode temp = head;
			head = head.getNext();
			temp.setNext(null);
			ListNode temp1 = head;
			while(true){

				System.out.print("\n " + temp1.getData() + " ");
				temp1 = temp1.getNext();
				if( temp1 == null){
					break;
				}
			}


		}

	}


	public void delFromMiddle(int position){
		ListNode previous = head;
		//	int position = 2;
		int count = 1;
		while(count < position - 1){
			previous = previous.getNext();
			count ++;
		}
		ListNode currunt = previous.getNext();
		ListNode currunt1 = currunt.getNext();
		previous.setNext(currunt1);
		currunt.setNext(null);
		while(true){
			System.out.print(" " +previous.getData()+ " ");
			previous = previous.getNext();
			if (previous == null){
				break;
			}
		}
		}


	public void delFromTail(){
		ListNode temp = head;
		do{
			temp = temp.getNext();
		}while(temp.getNext() == null);
		ListNode temp1 = temp.getNext();
		ListNode temp2 = temp1.getNext();
		ListNode temp3 = temp2.getNext();
		temp3.setNext(null);
		ListNode temp4 = head;
		while(true){
			System.out.print(" " + temp4.getData() + " ");
			temp4 = temp4.getNext();
			if ( temp4 == null){
				break;
			}
		}
	}



	public int Search(int val){
		ListNode temp = head;
		while(true){
			temp = temp.getNext();
			if(temp == null){
				break;
			}
			if(temp.getData() == val){
				System.out.println("\nThe value is present : " + val);
			}

		}

		return 0;
	}

	public int delvalue(int val){
		ListNode temp = head;
		while(true){
			temp = temp.getNext();
			if(temp == null){
				break;
			}
			if(temp.getData() == val){
				ListNode next = temp.getNext();
				ListNode curr = next.getNext();
				ListNode previous = curr.getNext();
				previous.setNext(next);
				curr.setNext(null);
				ListNode temp1 = head;
				while(true){
				System.out.print(" " + temp1.getData() + " ");
				temp1 = temp1.getNext();
				if(temp1 == null){
				break;
				}
				}

			}
		}
		return 0;
	} 

	public void FindMiddle(){
		ListNode temp = head;
		ListNode temp1 = head.getNext();
		while(true){
			temp1 = temp1.getNext();
			temp = temp.getNext();
			temp1 = temp1.getNext();
			if(temp1 == null){
				System.out.println("\nThe middle is: " +temp.getData());
				break;
			}

		}


	}

	public void FindNth(int pos){
		ListNode temp = head;
		ListNode temp1 = head;
		for(int i = 0; i < pos; i++){
			temp1 = temp1.getNext();
		}
		while(true){
			temp = temp.getNext();
			temp1 = temp1.getNext();
			if(temp1 == null){
				System.out.println("The "+ pos + " th element from tail side is: " +temp.getData());
				break;
			}
		}
	}


	public void getElement(){
		int count = 0;
		ListNode temp = head;
		while(true){
			count++;
			temp = temp.getNext();
			if(temp == null){
				break;
			}
		}
		System.out.print("\nThe no. of element is: " + count );
	}


	public void sortList(){
		ListNode temp = head;
		ListNode temp1 = temp.getNext();
		while(true){
			temp = temp.getNext();
			temp1 = temp1.getNext();
			int a = temp.getData();
			int b = temp1.getData();
			int c;
			System.out.print("\nThe sorted list: " + temp.getData());
			if( temp1.getNext() == null){
			break;
			}
			if( a > b ){
			c = a;
			a = b;
			b = c;
			}
			//if( temp1 == null){
			//break;
			//}
		}
		System.out.print("\nThe sorted list is: " + temp.getData() + " " );

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

