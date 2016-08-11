public class MainLinkedList{
	public static void main(String[] argv){
		LinkedList x = new LinkedList();
		x.addAtHead(10);
		x.addAtHead(20);
		x.addAtHead(30);
//		x.addAtTail(22);
		x.addAtHead(40);
		x.addAtHead(50);
//		x.addAtTail(1);
		x.addAtMiddle(35,3);
		
		x.delFromHead();
		x.delFromTail();
//		x.delFromMiddle(2);
//		x.search(35);
//		x.printAll();
//		x.getElement();
//		x.delValue(50);
		x.printAll();
	}
}
