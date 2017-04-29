import java.util.Stack;
class BST
{
	BSTNode root;

	BST()
	{
		root=null;
	}


	public void insert(String name,String meaning)
	{
		root=insert(root,name,meaning);
	}

	public BSTNode insert(BSTNode node,String name,String meaning)
	{
		if(node==null)
		{
			node=new BSTNode(name,meaning);
		}
		else
		{
			
			if(name.compareTo(node.getName())>0)
			{
				node.left=insert(node.left,name,meaning);
			}
			else
			{
				node.right=insert(node.right,name,meaning);
			}
		}
		return node;
	}


	public void search(String name)
	{
		search(root,name);
	}

	public void search(BSTNode r,String name)
	{
		if(r!=null)
		{
			search(r.getLeft(),name);
			if(r.getName().equalsIgnoreCase(name)){
				System.out.println(r.getMeaning());             
			}
			search(r.getRight(),name);
		}
	}



}

