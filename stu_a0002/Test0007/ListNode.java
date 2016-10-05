class ListNode
{
String name;
String clas;
int roll;
int marks;

ListNode next;

ListNode(String nm,String cls,int rl,int mks)
{
name=nm;
clas=cls;
roll=rl;
marks=mks;
next=null;
}

public void setNext(ListNode n)
{
next=n;
}

public ListNode getNext()
{
return next;
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
