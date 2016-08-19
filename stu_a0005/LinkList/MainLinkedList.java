class MainLinkedList{
	public static void main(String args[]){
		LinkedList l = new LinkedList();
		l.addAtHead(234);	
		l.addAtHead(99);
		l.addAtHead(5);
		l.addAtHead(23);
		l.addAtHead(345);
		l.addAtHead(4355);
		l.addAtHead(444);
//	        l.addAtMiddle(2323, 2);
//		l.addAtTail(16);
		l.printAll();
//		l.delFromHead();
//		l.delFromMiddle(2);
//		l.delFromTail();

//		l.delvalue(345);
                l.getElement();
		
		l.Search(99);
		l.FindMiddle();
		l.FindNth(5);


	}
}
