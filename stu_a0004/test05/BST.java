import java.io.*;
import java.util.Stack;
class BST 
{

	BSTNode root;
	BSTNode finleft;
	BSTNode ll;
	BST()
	{
		root=null;
	}

	public void insert(int data)
	{
		root=insert(root,data);
	}

	public BSTNode insert(BSTNode node,int data)
	{
		if(node==null)
		{
			node=new BSTNode(data);
		}
		else
		{
			if(data<=node.getData())
			{
				node.left=insert(node.left,data);
			}
			else
			{
				node.right=insert(node.right,data);
			}
		}
		return node;
	}

	public BSTNode postorder() throws IOException
	{
		BSTNode node=root;
		PrintWriter pw=new PrintWriter("output1.txt");
		pw.println("The Post Order Is");
		Stack<BSTNode> stack1=new Stack<BSTNode>();
		Stack<BSTNode> stack2=new Stack<BSTNode>();
		if(node==null)
		{
			//PrintWriter pw=new PrintWriter("output.txt");
			//pw.write("empty list");
			System.out.println("empty list");
		}
		else
		{
			while(node!=null)
			{
				stack1.push(node);
				node=node.getLeft();
				//	stack1.push(node);
				/*	if(node.getLeft()==null)
					{
					finleft=new BSTNode(node.getData());
					}*/
			}
			while(stack1.size()>0)
			{
				node=stack1.pop();
				if(node==root && stack2.size()>0)
				{
					stack1.push(node);
					while(stack2.size()>0)
					{
						node=stack2.pop();
						//System.out.println(node.getData());//--
						pw.println(node.getData());
					}
				}

				/*
				   if(stack1.size()==0 && stack2.size()==1)
				   {
				   while(stack2.size()>0){
				   node=stack2.pop();
				   System.out.println(node.getData());
				   }
				   }
				 */

				   else if(node.getLeft()!=null && node.getRight()!=null && stack2.size()>0)
				   {

					   stack2.push(node);
					   if(node.getRight()!=null)
					   {
						   node=node.getRight();	
						   //stack1.push(node);
						   while(node!=null)
						   {
		   //					stack1.push(node);	   //	System.out.println(node.getData());//--
						   pw.println(node.getData());	
							   node=node.getLeft();
						   }
					   }

					   while(stack2.size()>0)
					   {
						   node=stack2.pop();
						   //       System.out.println(node.getData());//--
						   pw.println(node.getData());
						   //stack1.push(node);
					   }
				   }
				   else 
				   {
		  //		        System.out.println(node.getData());
					   ll=node.getRight();
					   if(node.getRight()==null)
					   {
				 // System.out.println(node.getData());//--
						   pw.println(node.getData());
					   }
					   //        ll=node.getRight();
			else if(ll.getRight()==null && ll.getLeft()==null)
					   {
		 //	System.out.println(ll.getData());//--
						   pw.println(ll.getData());
		 //		System.out.println(node.getData());	//--
						   pw.println(node.getData());
					   }

					   else
					   //else if(node.getRight()!=null)
					   {
						   stack2.push(node);
						   node=node.getRight();
						   while(node!=null)
						   {
							   stack1.push(node);
							   node=node.getLeft();
						   }

					   }


				   }
				   if(stack1.size()==0 && stack2.size()>0)
				   {
					   while(stack2.size()>0)
					   {
						   node=stack2.pop();					   //System.out.println(node.getData());//--
						   pw.println(node.getData());
					   }
				   }

			}



		}
		pw.close();
		return node;
	}
public void lca(int num1,int num2) throws IOException
{
root=lca(root,num1,num2);
}
public BSTNode lca(BSTNode node,int num1,int num2) throws IOException
{
//BSTNode node=root;
PrintWriter pw=new PrintWriter("output2.txt");
pw.println("The Lowest Common Ancestor is");
if(node==null)
{
System.out.println("Tree is Empty");
}
if(num1<node.getData()&& num2<node.getData())
{
BSTNode res=lca(node.left,num1,num2);
//System.out.println(res.getData());
pw.println(res.getData());
pw.close();
return res;
}
else if(num1>node.getData()&&num2>node.getData())
{
BSTNode res=lca(node.right,num1,num2);
//System.out.println(res.getData());
pw.println(res.getData());
pw.close();
return res;
}
else
{
//System.out.println(node.getData());
pw.println(node.getData());
pw.close();
return node;
}
}
}
