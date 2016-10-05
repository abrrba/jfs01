class BSTNode
{
BSTNode left,right;
int data;

BSTNode()
{
left=null;
right=null;
data=0;
}

BSTNode(int d)
{
left=null;
right=null;
data=d;
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

public void setData(int d)
{
data=d;
}

public int getData()
{
return data;
}
}
