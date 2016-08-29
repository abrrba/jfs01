class Node
{
private int data;
private Node next;

Node(int d)
{
data=d;
next=null;
}

public void setData(int d)
{
data=d;
}

public int getData()
{
return data;
}

public void setNext(Node n)
{
next=n;
}

public Node getNext()
{
return next;
}
}