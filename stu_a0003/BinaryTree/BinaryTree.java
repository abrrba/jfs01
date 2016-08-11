class BinaryTree{
	private BinaryNode root;
	
	BinaryTree(){
		root = null;
	
	}
		
	public void insert(int data)
	{
		root=insert(root,data);
	}

	public BinaryNode insert(BinaryNode node,int data)
	{
		BinaryNode node1=null;;
		if(node==null)
		{
			node=new BinaryNode(data);
		}
		else
		{
			if(data<=node.getData())
			{
				node.left=insert(node.left,data);
			}
			else
			{
				node.right=insert(node.right,data);
			}
		}
		return node;
	}
	public boolean search(int val)

	{

		return search(root, val);

	}

	private boolean search(BinaryNode r, int val)

	{

		if (r.getData() == val)

			return true;

		if (r.getLeft() != null)

			if (search(r.getLeft(), val))

				return true;

		if (r.getRight() != null)

			if (search(r.getRight(), val))

				return true;

		return false;         

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

	public void inorder()
	{
		inorder(root);
	}

	public void inorder(BinaryNode r)
	{
		if(r!=null)
		{
			inorder(r.getLeft());
			System.out.print(r.getData());
			inorder(r.getRight());
		}
	}

	public void preorder()
	{
		preorder(root);
	}

	public void preorder(BinaryNode r)
	{
		if(r!=null)
		{
			System.out.print(r.getData());
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}

	public void postorder()
	{
		postorder(root);
	}

	public void postorder(BinaryNode r)
	{
		if(r!=null)
		{
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getData());
		}
	}



}

