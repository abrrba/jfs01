public class LinkNode{
	private int data;
	private LinkNode next;

	LinkNode(int val){
		data = val;
		next = null;
	}
	public void setData(int val){
		data = val;
	}
	public int getData(){
		return data;
	}
	public void setNext(LinkNode n){
		next  = n;
	}
	public LinkNode getNext(){
		return next;
	}
}
