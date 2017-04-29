class BSTNode
{
	BSTNode left,right;
	String name;
	String meaning;

	BSTNode()
	{
		left=null;
		right=null;
		name=null;
		meaning=null;
	}


	BSTNode(String nme,String mean)
	{
		left=null;
		right=null;
		name=nme;
		meaning=mean;
	}

	public void setRight(BSTNode n)
	{
		right=n;
	}

	public BSTNode getRight()
	{
		return right;
	}

	public void setLeft(BSTNode n)
	{
		left=n;
	}

	public BSTNode getLeft()
	{
		return left;
	}

	public void setName(String name)
	{
		name=name;
	}

	public String getName()
	{
		return name;
	}

	public void setMeaning(String mean)
	{
		meaning=mean;
	}

	public String getMeaning()
	{
		return meaning;
	}
}

