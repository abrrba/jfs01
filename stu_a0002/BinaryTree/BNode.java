class BNode
{
	BNode left,right;
	int data;

	public BNode()
	{
		left=null;
		right=null;
		data=0;
	}
	public BNode(int n)
	{
		left=null;
		right=null;
		data=n;
	}

	public void setLeft(BNode n)
	{
		left=n;
	}

	public void setRight(BNode n)
	{
		right=n;
	}

	public BNode getLeft()
	{
		return left;
	}

	public BNode getRight()
	{
		return right;
	}

	public void setData(int d)
	{
		data=d;
	}

	public int getData()
	{
		return data;
	}
}
