public class LinkNode{
	private int roll,mark;
	private String name,clas;
	private LinkNode next;

	LinkNode(int r,int m,String n,String c){
		roll = r;
		mark = m;
		name = n;
		clas = c;
		next = null;
	}
	public void setData(int roll,int mark,String name,String clas){
		this.roll = roll;
		this.mark = mark;
		this.name = name;
		this.clas = clas;
	}
	public int getData(){
		return roll;
	}
	public void setNext(LinkNode n){
		next  = n;
	}
	public LinkNode getNext(){
		return next;
	}
}
