class BinaryTree{
	private BinaryNode root;
	
	BinaryTree(){
		root = null;
	
	}
		
	public void insert(int data,String name){
		root=insert(root,data,name);
	}

	public BinaryNode insert(BinaryNode node,int data,String name){
		if(node==null){
			node=new BinaryNode(data,name);
		}
		else{
			if(data<=node.getData()){
				node.left=insert(node.left,data,name);
			}
			else{
				node.right=insert(node.right,data,name);
			}
		}
		return node;
	}
	public void reinsert(int data,String name){
		root = reinsert(root,data,name);
	}
	public BinaryNode reinsert(BinaryNode node,int data,String name){
		if(node==null){
			node=new BinaryNode(data,name);
		}
		else{
			if(data>=node.getData()){
				node.left=insert(node.left,data,name);
			}
			else{
				node.right=insert(node.right,data,name);
			}
		}
		return node;
	}

	public void inorder(){
		inorder(root);
	}

	public void inorder(BinaryNode r){
		if(r!=null){
			inorder(r.getLeft());
			System.out.println( + r.getData()+" -   "+r.getName());
			inorder(r.getRight());
		}
	}
}

