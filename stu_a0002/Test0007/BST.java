import java.util.Stack;
class BST
{
	BSTNode root;
	ListNode head;

	BST()
	{
		root=null;
		head=null;
	}


	public void insert(String name,String clas,int roll,int marks)
	{
		root=insert(root,name,clas,roll,marks);
	}

	public BSTNode insert(BSTNode node,String name,String clas,int roll,int marks)
	{
		if(node==null)
		{
			node=new BSTNode(name,clas,roll,marks);
		}
		else
		{
			if(roll<=node.getRoll())
			{
				node.left=insert(node.left,name,clas,roll,marks);
			}
			else
			{
				node.right=insert(node.right,name,clas,roll,marks);
			}
		}
		return node;
	}

public BSTNode postorder()
	{
		BSTNode node=root;
		BSTNode ll;
		
		Stack<BSTNode> stack1=new Stack<BSTNode>();
		Stack<BSTNode> stack2=new Stack<BSTNode>();
		if(node==null)
		{

			System.out.println("empty list");
		}
		else
		{
			while(node!=null)
			{
				stack1.push(node);
				node=node.getLeft();
	
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
						addAtTail(node.getName(),node.getClas(),node.getRoll(),node.getMarks());
						
					}
				}

	

				   else if(node.getLeft()!=null && node.getRight()!=null && stack2.size()>0)
				   {

					   stack2.push(node);
					   if(node.getRight()!=null)
					   {
						   node=node.getRight();	
						  
						  while(node!=null)
						   {
		  
						  	addAtTail(node.getName(),node.getClas(),node.getRoll(),node.getMarks());
							node=node.getLeft();
						   }
					   }

					   while(stack2.size()>0)
					   {
						   node=stack2.pop();
						  
						   addAtTail(node.getName(),node.getClas(),node.getRoll(),node.getMarks());

					   }
				   }
				   else 
				   {
		  
					   ll=node.getRight();
					   if(node.getRight()==null)
					   {
				
						   addAtTail(node.getName(),node.getClas(),node.getRoll(),node.getMarks());

					   }
					 
			else if(ll.getRight()==null && ll.getLeft()==null)
					   {
		 
							addAtTail(ll.getName(),ll.getClas(),ll.getRoll(),ll.getMarks());

							 addAtTail(node.getName(),node.getClas(),node.getRoll(),node.getMarks());
					   }

					   else
					   
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
						   node=stack2.pop();					   
						    addAtTail(node.getName(),node.getClas(),node.getRoll(),node.getMarks());
					   }
				   }

			}



		}
		
		return node;
	}

	public void addAtTail(String name,String clas,int roll,int marks)
	{
		if(head==null)
		{
			head=new ListNode(name,clas,roll,marks);
			head.setNext(null);
		}
		else
		{
			ListNode tail=new ListNode(name,clas,roll,marks);
			ListNode temp=head;
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(tail);
			tail.setNext(null);
		}
	}
	public void printAll()
	{
		if(head==null)
		{
			System.out.println(" Empty LinkedList");
		}
		else
		{
			ListNode temp=head;
			 System.out.println("Data Parsing in iterative Postorder");
			while(temp!=null)
			{
				
				System.out.println("Name: " +temp.getName() + " Class: " +temp.getClas()+" Roll: " +temp.getRoll() + " marks : " + temp.getMarks());
				temp=temp.getNext();
			}
			

		}
	}

}

