import java.util.Stack;
class BST
{
private	BSTNode root;

	BST()
	{
		root=null;
	}

	public void insert(int data)
	{
	root=insert(root,data);
	}

	public BSTNode insert(BSTNode  node,int data)
	{
	//	BSTNode node=root;
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
System.out.println(r.getData());
inorder(r.getRight());
}
}



/*	public void inorder()
	{
		BSTNode node=root;
		Stack<BSTNode> stack=new Stack<BSTNode>();
		//BSTNode node=root;
		while(node!=null)
		{
			stack.push(node);
			node=node.getLeft();
		//	System.out.println("kk");
		}
		while(stack.size() >0)
		{
			node=stack.pop();
			System.out.println(node.getData());
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
	}*/
}
