
import java.util.Stack;
class BinarySearchTree
{
	BNode Parent;

	BinarySearchTree()
	{
		 Parent=null;
	}

	public void insert(int EmpId,String name)
	{
		 Parent=insert( Parent,EmpId,name);
	}

	public BNode insert(BNode node,int EmpId,String name)
	{
		if(node==null)
		{
			node= new BNode(EmpId,name);
		}
		else
		{
			if(EmpId<=node.getEmpId())
			{
				node.left=insert(node.left,EmpId,name);
			}
			else
			{
				node.right=insert(node.right,EmpId,name);
			}
		}
		return node;
	}

	public void insertt(int EmpId,String name)
	{
		 Parent=insertt( Parent,EmpId,name);
	}

	public BNode insertt(BNode node,int EmpId,String name)
	{
		if(node==null)
		{
			node=new BNode(EmpId,name);
		}
		else
		{
			if(EmpId<=node.getEmpId())
			{
				node.right=insertt(node.right,EmpId,name);
			}
			else
			{
				node.left=insertt(node.left,EmpId,name);
			}
		}
		return node;
	}
	

	public void inorder()
	{
		BNode node= Parent;
		Stack<BNode> stack=new Stack<BNode>();

		while(node!=null)
		{
			stack.push(node);
			node=node.getLeft();
		}


		while(stack.size() >0)
		{
			node=stack.pop();
			System.out.println("EmpId is " + node.getEmpId() + " Name " + node.getName());

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


}