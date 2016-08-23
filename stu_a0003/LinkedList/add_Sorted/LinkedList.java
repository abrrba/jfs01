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
	public int addAfter(int data,int node){
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
	public int addAtMiddle(int data){
		LinkedList m = new LinkedList();
		LinkNode node = new LinkNode(data);
		if(head==null){
			node.setNext(null);
			head=node;//1
		}else if(head.getNext()==null){
			head.setNext(node);
			node.setNext(null);
		}else{LinkNode temp = head;
			int count = 0;
			while(temp.getNext()!=null){
			count = count +1;
			}
			int middle = count/2;
			m.addAfter(data,middle);
		
		}return 0;

	}
	public int delFromHead(){
		int temp = head.getData();
		head = head.getNext();
		return(temp);
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
	public void addAtSorted(int data){
		LinkNode node = new LinkNode(data);
		if(head==null){
			node.setNext(null);
			head = node;//12
		}else if(node.getData()/*9*/<=head.getData()){
			node.setNext(head);
			head = node;//9 12
		}
		else{	
			LinkNode sort = head;
			if(node.getData/*98*/()>head.getData()/*9*/){
				if(head.getNext()==null){
					sort.setNext(node);/*9 12 98*/
					node.setNext(null);
				}
				else{
					LinkNode temp/*12*/ = head.getNext();
					LinkNode temp1/*null*/ = temp.getNext();
					if(temp.getData()/*12*/<=node.getData()/*98*/){
						if(temp.getNext()==null){
							temp.setNext(node);
							node.setNext(null);
						}else{
						while(temp1.getData()<=node.getData()){
							temp/*31*/ = temp.getNext();
							temp1 = temp1.getNext();
							if(temp1==null){break;}
						}
						}
						temp.setNext(node);//20 30 31 35
						node.setNext(temp1);//20 30 31 42 35 50
					}else if(temp.getData()>=node.getData()){
					//	while(temp.getData()>=node.getData()){
					//		temp = temp.getNext();
					//		sort = sort.getNext();
					//	}
						sort.setNext(node);
						node.setNext(temp);
					}
				}
			}
		}
	}	
}
