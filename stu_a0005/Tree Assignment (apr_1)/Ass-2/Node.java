class Node
{
	Node left,right;
	String name;
	String meaning;

	Node()
	{
		left=null;
		right=null;
		name=null;
		meaning=null;
	}


	Node(String nme,String mean)
	{
		left=null;
		right=null;
		name=nme;
		meaning=mean;
	}

	public void setRight(Node n)
	{
		right=n;
	}

	public Node getRight()
	{
		return right;
	}

	public void setLeft(Node n)
	{
		left=n;
	}

	public Node getLeft()
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

