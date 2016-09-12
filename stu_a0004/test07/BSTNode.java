class BSTNode
{
BSTNode left,right;
String name;
String clas;
int roll;
int marks;

BSTNode()
{
left=null;
right=null;
name=null;
clas=null;
roll=0;
marks=0;
}


BSTNode(String nm,String cls,int rl,int mks)
{
left=null;
right=null;
name=nm;
clas=cls;
roll=rl;
marks=mks;
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

public void setName(String nm)
{
name=nm;
}

public String getName()
{
return name;
}

public void setClas(String cls)
{
clas=cls;
}

public String getClas()
{
return clas;
}

public void setRoll(int rl)
{
roll=rl;
}

public int getRoll()
{
return roll;
}
public void setMarks(int mks)
{
marks=mks;
}

public int getMarks()
{
return marks;
}
}

