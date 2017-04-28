class BinaryNode
{
	BinaryNode left,right;
	String name;
	String meaning;

	BinaryNode()
	{
		left=null;
		right=null;
		name=null;
		meaning=null;
	}


	BinaryNode(String nme,String mean)
	{
		left=null;
		right=null;
		name=nme;
		meaning=mean;
	}

	public void setRight(BinaryNode n)
	{
		right=n;
	}

	public BinaryNode getRight()
	{
		return right;
	}

	public void setLeft(BinaryNode n)
	{
		left=n;
	}

	public BinaryNode getLeft()
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

