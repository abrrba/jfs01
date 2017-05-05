class BST
{
	private BSTNode root;
	

	public void insert(int data)
	{
		root=insert(root,data);
	}

	public BSTNode insert(BSTNode node,int data)
	{
		BSTNode node1=null;;
		if(node==null)
		{
			node=new BSTNode(data);
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

	public void inorder()
	{
		inorder(root);
	}

	public void inorder(BSTNode r)
	{
		if(r!=null)
		{
			inorder(r.getLeft());
			System.out.print(r.getData() + " " );
			inorder(r.getRight());
		}
	}

	public void preorder()
	{
		preorder(root);
	}

	public void preorder(BSTNode r)
	{
		if(r!=null)
		{
			System.out.print(r.getData() + " ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}

	public void postorder()
	{
		postorder(root);
	}

	public void postorder(BSTNode r)
	{
		if(r!=null)
		{
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getData() + " ");
		}
	}



}

