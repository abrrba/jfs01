mport java.util.*;
class BinaryTree{
	private BinaryNode root;
	private BinaryNode head;
	Stack<BinaryNode> stack=new Stack<BinaryNode>();
	LinkedList l = new LinkedList();
	BinaryTree(){
		root = null;

	}

	public void insert(int data){
		root=insert(root,data);
	}

	public BinaryNode insert(BinaryNode node,int data){
		if(node==null){
			node=new BinaryNode(data);
		}
		else{
			if(data<=node.getData()){
				node.left=insert(node.left,data);
			}
			else{
				node.right=insert(node.right,data);
			}
		}
		return node;
	}
	public void printAll(){
		printAll(root);
	}
	public void printAll(BinaryNode root){
		if(root!=null){
			printAll(root.getLeft());
			System.out.print(" " + root.getData());
			printAll(root.getRight());
		}
	}

	public void printDLL(){
		printDLL(root);

	}
	public void printDLL(BinaryNode root){
		BinaryNode current = root;

		while(current.getLeft()!=null){
			stack.push(current);	
			current = current.getLeft();
		}
		right(current);	
	}
	public void right(BinaryNode root){
		BinaryNode current = root;
		if(current.getRight()!=null){
			current = current.getRight();
			printDLL(current);
		}
		else{
			if(current.getLeft()==null){
				System.out.print(" "+current.getData());

				l.addAtTail(current.getData());
			}
			if(!stack.empty()){
				current = stack.pop();
				right(current);
			}
		}
	}
	public void linkedListData(){
		l.printAll();
	} 
}
