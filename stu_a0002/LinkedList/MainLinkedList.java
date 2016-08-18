public class MainLinkedList{
	public static void main(String[] argv){
		LinkedList e = new LinkedList();
		e.addAtHead(2);
		e.addAtHead(5);
		e.addAtHead(7);
		e.addAtTail(11);
		e.addAtHead(17);
		e.addAtHead(23);
		e.addAtTail(31);
		e.addAtMiddle(29,2);
		
		e.delFromHead();
		e.delFromTail();
//		e.delFromMiddle(2);
//		e.search(17);
//		e.printAll();
//		e.getElement();
//		e.delValue(23);
		e.printAll();
	}
}
