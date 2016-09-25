public class LinkedList{

	private LinkNode head;

	LinkedList(){
		head = null;
	}
	public int addAtHead(int roll,int mark,String name,String Clas){
		if(head==null){
			head = new LinkNode(roll,mark,name,clas);
			head.setNext(null);
			return 0;
		}
		else{
			LinkNode temp = new LinkNode(roll,mark,name,clas);
			temp.setNext(head);
			head = temp;
			return 0;
		}
	}
	public int addAtTail(int roll,int mark,String name,String clas){
		if(head==null){
			System.out.println("Error");
			return 0;
		}
		else{
			LinkNode temp = head;
			while(temp.getNext()!=null){
				temp = temp.getNext();	
			}
			LinkNode tail = new LinkNode(roll,mark,name,clas);
			temp.setNext(tail);
			tail.setNext(null);
			return 0;
		}
	}
	public int addAtMiddle(int roll,int node,int mark,String name,String clas){
		LinkNode middle = new LinkNode(roll,mark,name,clas);
		LinkNode temp = head;	
		for(int i=1;i<node;i++){
			temp = temp.getNext();		
		}
		LinkNode temp1 = temp.getNext();
		temp.setNext(middle);
		middle.setNext(temp1);
		return 0;
	}
			
}
