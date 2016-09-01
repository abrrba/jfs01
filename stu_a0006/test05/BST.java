import java.util.Stack;
class BST
{
BSTNode root;
BST()
{
root=null;
}
public  void  insert(int val,String data)
{
root =insert(root,val,data);
}
public BSTNode insert(BSTNode node,int val ,String data)
{
if (node==null)
{
node=new BSTNode(val,data);
}
else
{
if(val<=node.getRno())
{
node.left=insert(node.left,val,data);
}
else
{
node.right=insert(node.right,val,data);
}
}
return(node);
}


public void inorder()
{
BSTNode node=root;
Stack <BSTNode>Stack=new Stack <BSTNode>();
while(node!=null)
{
Stack.push(node);
node=node.getLeft();
}
while(Stack.size()>0)
{
node=Stack.pop();
System.out.println(+node.getRno()+node.getdata());
if(node.getRight()!=null)
{
node=node.getRight();
while(node!=null)
{
Stack.push(node);
node=node.getLeft();
}
}
}
}
public void dinsert(int val,String data)
{
root=dinsert(root,val,data);
}
public BSTNode dinsert(BSTNode node, int val,String data)
{
if(node==null)
{
node=new BSTNode(val,data);
}
else
{
if(val<=node.getRno())
{
node.right=dinsert(node.right,val ,data);
}
else
{
node.left=dinsert(node.left,val,data);
}
}
return node;
}
}






























