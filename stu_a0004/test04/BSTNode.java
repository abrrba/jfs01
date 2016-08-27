class BSTNode
{
	BSTNode left,right;
	int rno;
	String name;


	BSTNode()
	{
		left=null;
		right=null;
		rno=0;
		name=null;
	}

	BSTNode(int rn,String n)
	{
		left=null;
		right=null;
		rno=rn;
		name=n;
	}

	public void setLeft(BSTNode n)
	{
		left=n;
	}

	public BSTNode getLeft()
	{
		return left;
	}

	public void setRight(BSTNode n)
	{
		right=n;
	}

	public BSTNode getRight()
	{
		return right;
	}

	public void setRno(int rn)
	{
		rno=rn;
	}

	public int getRno()
	{
		return rno;
	}

	public void setName(String n)
	{
		name=n;
	}

	public String getName()
	{
		return name;
	}
}
