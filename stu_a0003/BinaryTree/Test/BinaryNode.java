class BinaryNode
{
	BinaryNode left,right;
	int data;
	String name;
	public BinaryNode()
	{
		left=null;
		right=null;
		data=0;
		name=null;
	}
	public BinaryNode(int n,String nm)
	{
		left=null;
		right=null;
		data=n;
		name = nm;
	}
	public void setLeft(BinaryNode n)
	{
		left=n;
	}
	public void setRight(BinaryNode n)
	{
		right=n;
	}
	public BinaryNode getLeft()
	{
		return left;
	}
	public BinaryNode getRight()
	{
		return right;
	}
	public void setName(String n){
		name = n;
	}
	public void setData(int d)
	{
		data=d;
	}
	public String getName(){
		return name;
	}

	public int getData()
	{
		return data;
		
	}
}
