class BST{
	Node root;

	BST(){
		root = null;

	}

	public void InsertElement(int k){

		root = insert(root,k);
	}

	public Node insert(Node node, int k){
		Node node1 = null;
		if(node == null){
			node = new Node(k);

		}
		else{
			if(k <= node.getKey()){
				node.left = insert(node.left,k);
			}
			else{
				node.right = insert(node.right,k);
			}

		}
		return node;
	}

	public void Inorder(){
		Inorder(root);
	}
	public void Inorder(Node n){
		if(n != null){
			Inorder(n.getLeft());
			System.out.print(" " + n.getKey() + " ");
			Inorder(n.getRight());
		}

	}

	public void Preorder(){
		Preorder(root);
	}
	public void Preorder(Node n){
		if(n != null){
			System.out.print(" " + n.getKey() + " ");
			Preorder(n.getLeft());
			Preorder(n.getRight());
		}
	}

	public void Postorder(){
		Postorder(root);
	}
	public void Postorder(Node n){
		if(n != null){
			Postorder(n.getLeft());
			Postorder(n.getRight());
			System.out.print(" " + n.getKey() + " ");
		}
	}


}
