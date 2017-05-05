import java.util.*;
class BST{
	private Node root;
	private Node head;
	Stack<Node> stack=new Stack<Node>();
	LinkedList l = new LinkedList();
	BST(){
		root = null;

	}

	public void insert(int data){
		root=insert(root,data);
	}

	public Node insert(Node node,int data){
		if(node==null){
			node=new Node(data);
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
	public void printAll(Node root){
		if(root!=null){
			printAll(root.getLeft());
			System.out.print(" " + root.getData());
			printAll(root.getRight());
		}
	}

	public void printDLL(){
		printDLL(root);

	}
	public void printDLL(Node root){
		Node current = root;

		while(current.getLeft()!=null){
			stack.push(current);	
			current = current.getLeft();
		}
		right(current);	
	}
	public void right(Node root){
		Node current = root;
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

