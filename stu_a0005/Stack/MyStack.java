import java.util.*;

class MyStack {  
	private ListNode top;  

	MyStack () {    
		top = null;

	}

	public int Push (int data) {   
		if (top == null) {
			top = new ListNode (data);
			top.setNext(null);    
			return 0;
		} else {
			ListNode temp = new ListNode (data);
			temp.setNext(top);
			top = temp;
			return 0;
		}
	}

	public int Pop(){
		if(top == null){
			System.out.println("No element for pop ");
		}
		else{
			top = top.getNext();
		}
		return 0;
	}
	public void printAll () {
		if (top == null) {
			System.out.println("Unable to print as LinkList is empty\n");
		} else {
			ListNode temp = top;
			while (true) {
				System.out.println ( " " + temp.getData() + " ");
				temp = temp.getNext();
				if (temp == null) {
					break;
				}
			}
		}
	}
}
