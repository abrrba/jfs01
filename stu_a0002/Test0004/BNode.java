
class BNode
{
	BNode left,right;
	int EmpId;
	String name;


	BNode()
	{
		left=null;
		right=null;
		EmpId=0;
		name=null;
	}

	BNode(int EId,String n)
	{
		left=null;
		right=null;
		EmpId=EId;
		name=n;
	}

	public void setLeft(BNode n)
	{
		left=n;
	}

	public BNode getLeft()
	{
		return left;
	}

	public void setRight(BNode n)
	{
		right=n;
	}

	public BNode getRight()
	{
		return right;
	}

	public void setEmpId(int EId)
	{
		EmpId=EId;
	}

	public int getEmpId()
	{
		return EmpId;
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