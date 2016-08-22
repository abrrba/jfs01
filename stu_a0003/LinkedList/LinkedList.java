public class LinkedList{

	private LinkNode head;

	LinkedList(){
		head = null;
	}
	public int addAtHead(int data){
		if(head==null){
			head = new LinkNode(data);
			head.setNext(null);
			return 0;
		}
		else{
			LinkNode temp = new LinkNode(data);
			temp.setNext(head);
			head = temp;
			return 0;
		}
	}
	public int addAtTail(int data){
		if(head==null){
			System.out.println("Error");
			return 0;
		}
		else{
			LinkNode temp = head;
			while(temp.getNext()!=null){
				temp = temp.getNext();	
			}
			LinkNode tail = new LinkNode(data);
			temp.setNext(tail);
			tail.setNext(null);
			return 0;
		}
	}
	public int addAtMiddle(int data,int node){
		LinkNode middle = new LinkNode(data);
		LinkNode temp = head;	
		for(int i=1;i<node;i++){
			temp = temp.getNext();		
		}
		LinkNode temp1 = temp.getNext();
		temp.setNext(middle);
		middle.setNext(temp1);
		return 0;
	}
	public int delFromHead(){
		LinkNode temp = head;
		head = head.getNext();
		return(temp.getData());
	}
	public void delFromTail(){
		LinkNode temp = head;
		LinkNode temp1 = temp.getNext();
		while(temp1.getNext()!=null){
			temp1 = temp1.getNext();
			temp = temp.getNext();
		}
		temp.setNext(null);
	}
	public int delFromMiddle(int node){
		LinkNode temp = head;
		for(int i=0;i<node;i++){
			temp = temp.getNext();				     	        	}			
		LinkNode temp1 = temp.getNext();
		LinkNode temp2=temp1.getNext();
		temp.setNext(temp2);
		return 0;
	}
	public int search(int data){
		LinkNode temp = head;
		int count = 0;
		while(temp!=null){
			if(temp.getData()==data)
				System.out.println("Node is Available at position :" +count);
			temp = temp.getNext();
			count++;	
		}return 0;
	}
	public void getElement(){
		LinkNode temp = head;
		int count=0;
		while(temp!=null){
			temp = temp.getNext();
			count++;
		}
		System.out.println("Elements in the LinkedList is :" + count);
	}
	/*	public int delValue(int data){
		LinkNode temp = head;
		int count = 0;
	//	while(temp.getNext() != null){
	//		temp = temp.getNext();
	//		count++;
	//		if(temp.getData()==data)
	//			break;					
	//	}
	//	temp = head;
	for(int i=0;i<6 ;i++){
	temp = temp.getNext();
	count++;
	if(temp.getData()==data)
	break;		
	}LinkNode temp1 = temp.getNext();
	LinkNode temp2 = temp1.getNext();
	temp.setNext(temp2);
	return 0;
	}*/
	public void printAll(){
		if(head==null){
			System.out.println("Linked List is not prasent...! ");
		}
		else{
			LinkNode temp = head;
			while(true){
				System.out.print(" " + temp.getData() + " ");
				temp = temp.getNext();
				if(temp==null){
					break;
				}
			}

		}
	}
	public int addAtSorted(int node){
		LinkedList y = new LinkedList();
		LinkNode temp = new LinkNode(node);
//		if(head==null){
		temp.setNext(null);	
	//		LinkNode head = temp;
	//		head.setNext(null);
//			return 0;	
//		}
	/*	else{
			LinkNode sort = new LinkNode(head.getData());
			//LinkNode gret = head.getNext();
			if(head.getData()<node){
				if(head.getNext()==null){
					y.addAtTail(node);
				}
				LinkNode gret = head.getNext();
				while(node>gret.getData()){
					gret = gret.getNext();
					sort = sort.getNext();
				}
				sort.setNext(temp);
				temp.setNext(gret);
			}
			else if(head.getData()>=temp.getData()){
				y.addAtHead(node);
			}
		}		*/				
		return 0;
	}
}
