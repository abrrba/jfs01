class BinaryTree{
	Node root;
	BinaryTree(){
		root = null;
	}
	public void insert(int roll,int mark,String name,String clas){
		root = insert(root,roll,mark,name,clas);
	}
	public Node insert(Node node,int roll,int mark,String name,String clas)
        {
                Node node1=null;;
                if(node==null)
                {
                        node=new Node(roll,mark,name,clas);
                }
                else
                {
                        if(roll<=node.roll)
                        {
                                node.left=insert(node.left,roll,mark,name.clas);
                        }
                        else
                        {
                                node.right=insert(node.right,roll,mark,name.clas);
                        }
                }
                return node;
        }
	public void postorder()
	{
		postorder(root);
	}

	public void postorder(Node r)
	{
		if(r!=null)
		{
			postorder(r.left);
			postorder(r.right);
			System.out.print(r.roll,mark,name,clas);
		}
	}

	
}
