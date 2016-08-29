class BSTNode
{
	BSTNode left,right;
	int val;
	String data;


	BSTNode()
	{
		left=null;
		right=null;
		val=0;
		data=null;
	}

	BSTNode(int rn,String n)
	{
		left=null;
		right=null;
		val=rn;
		data=n;
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
		val=rn;
	}

	public int getRno()
	{
		return val;
	}

	public void setdata(String n)
	{
		data=n;
	}

	public String getdata()
	{
		return data;
	}
}
