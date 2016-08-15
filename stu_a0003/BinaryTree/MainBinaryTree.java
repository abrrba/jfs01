class MainBinaryTree{
	public static void main(String args[])
	{
		BinaryTree a = new BinaryTree();
		a.insert(5);
		a.insert(3);
		a.insert(7);
		a.insert(2);
		a.insert(6);
		System.out.println("Binary Tree is :");
		a.printAll();
		System.out.println(" ");
		System.out.println("Inorder : ");
		a.inorder();
		System.out.println(" ");
		System.out.println("Preorder : ");
		a.preorder();
		System.out.println(" ");
		System.out.println("Postorder : ");
		a.postorder();
	}
}
