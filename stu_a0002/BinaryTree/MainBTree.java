class MainBTree{
	public static void main(String args[])
	{
		BTree e = new BTree();
		e.insert(11);
		e.insert(13);
		e.insert(17);
		e.insert(19);
		e.insert(23);
		System.out.println("Required binary tree  :");
		e.printAll();
		System.out.println(" ");
		System.out.println("Inorder : ");
		e.inorder();
		System.out.println(" ");
		System.out.println("Preorder : ");
		e.preorder();
		System.out.println(" ");
		System.out.println("Postorder : ");
		e.postorder();
	}
}
