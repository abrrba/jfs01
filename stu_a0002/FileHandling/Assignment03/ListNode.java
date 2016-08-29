class ListNode
{
private ListNode next;
private int id;
private String pos;
private String color;
private int marks;
private String subject;
private int physics;
private int chem;
private int math;

public ListNode(int d,String p,String c,int m,String s,int phy,int ch,int mt)
{
id=d;
pos=p;
color=c;
marks=m;
subject=s;
physics=phy;
chem=ch;
math=mt;
next=null;
}

public void setId(int d)
{
id=d;
}

public void setPos(String p)
{
pos=p;
}

public void setColor(String c)
{
color=c;
}

public void setMarks(int m)
{
marks=m;
}

public void setSubject(String s)
{
subject=s;
}

public void setPhysicsMarks(int phy)
{
physics=phy;
}

public void setChemMarks(int ch)
{
chem=ch;
}

public void setMathMarks(int mt)
{
math=mt;
}

public int getId()
{
return id;
}

public String getPos()
{
return  pos;
}

public String getColor()
{
return color;
}

public int getMarks()
{
return marks;
}

public String getSubject()
{
return subject;
}

public int getPhysicsMarks()
{
return physics;
}

public int getChemMarks()
{
return chem;
}

public int getMathMarks()
{
return math;
}


public void setNext(ListNode n)
{
next=n;
}

public ListNode getNext()
{
return next;
}
}
