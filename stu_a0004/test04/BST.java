import java.util.Stack;
class BST
{
	BSTNode root;

	BST()
	{
		root=null;
	}

	public void insert(int rno,String name)
	{
		root=insert(root,rno,name);
	}

	public BSTNode insert(BSTNode node,int rno,String name)
	{
		if(node==null)
		{
			node= new BSTNode(rno,name);
		}
		else
		{
			if(rno<=node.getRno())
			{
				node.left=insert(node.left,rno,name);
			}
			else
			{
				node.right=insert(node.right,rno,name);
			}
		}
		return node;
	}

	public void rinsert(int rno,String name)
	{
		root=rinsert(root,rno,name);
	}

	public BSTNode rinsert(BSTNode node,int rno,String name)
	{
		if(node==null)
		{
			node=new BSTNode(rno,name);
		}
		else
		{
			if(rno<=node.getRno())
			{
				node.right=rinsert(node.right,rno,name);
			}
			else
			{
				node.left=rinsert(node.left,rno,name);
			}
		}
		return node;
	}
	//Inorde with iterative

	public void inorder()
	{
		BSTNode node=root;
		Stack<BSTNode> stack=new Stack<BSTNode>();

		while(node!=null)
		{
			stack.push(node);
			node=node.getLeft();
		}


		while(stack.size() >0)
		{
			node=stack.pop();
			System.out.println("Roll No " + node.getRno() + " Name " + node.getName());

			if(node.getRight()!=null)
			{
				node=node.getRight();
				while(node!=null)
				{
					stack.push(node);
					node=node.getLeft();
				}
			}
		}
	} 

	//recursive Inorder
	/*
	   public void inorder()
	   {
	   inorder(root);
	   }

	   public void inorder(BSTNode r)
	   {
	   if(r!=null)
	   {
	   inorder(r.getLeft());
	   System.out.println("roll number" + r.getRno() +" Name " + r.getName());
	   inorder(r.getRight());
	   }
	   }
	 */
}
