public class MainLinkedList{
	public static void main(String[] argv){
		LinkedList x = new LinkedList();
//		x.addAtHead(10);
//		x.addAtHead(25);
//		x.printAll();
//		x.delFromHead();
//		x.delFromTail();
//		x.delFromMiddle(2);
//		x.search(35);
//		x.printAll();
//		x.getElement();
//		x.delValue(50);
///		LinkNode y = new LinkNode();
//		for(int i=0; i<5; i++){
//			y.addAtHead(x.delFromHead());
//		}
//		y.printAll();

		x.addAtSorted(50);
		x.addAtSorted(42);
		x.addAtSorted(31);
		x.addAtSorted(30);
		x.addAtSorted(20);
		x.addAtSorted(35);
		x.printAll();
	}
}
