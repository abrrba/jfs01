class BST{
	Node root;



	BST(){
		root = null;

	}

	public void InsertElement(int k, String s){

		root = insert(root, k, s);
	}

	public Node insert(Node node, int k, String s){
		Node node1 = null;
		if(node == null){
			node = new Node(k, s);

		}
		else{
			if(k <= node.getRno()){
				node.left = insert(node.left,k,s);
			}
			else{
				node.right = insert(node.right,k,s);
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
			System.out.print("Roll no- " + n.getRno() + " Name : " + n.getName() + " " );
			Inorder(n.getRight());
		}

	}

	public void Preorder(){
		Preorder(root);
	}
	public void Preorder(Node n){
		if(n != null){
			System.out.print("Roll no- " + n.getRno() + " Name : " + n.getName() + " ");
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
			System.out.print("Roll no " + n.getRno() + " Name " + n.getName() + " ");
		}
	}

}


