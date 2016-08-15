class MainBST{
	public static void main(String args[]){
		BST b = new BST();
		b.InsertElement(2);
		b.InsertElement(4);
		b.InsertElement(6);
		b.InsertElement(3);
		b.InsertElement(5);
		b.InsertElement(8);
		b.InsertElement(7);
	
		System.out.println("inorder ");
		b.Inorder();
		System.out.println("\npreorder ");
		b.Preorder();
		System.out.println("\npostorder ");
		b.Postorder();



	}
}
