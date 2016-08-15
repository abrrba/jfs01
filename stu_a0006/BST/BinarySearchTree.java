class BinarySearchTree
{
public static void main(String args[])
{
BST bst=new BST();
bst.insert(5);
bst.insert(3);
bst.insert(7);
bst.insert(2);
bst.insert(6);
System.out.println("inorder");
bst.inorder();
System.out.println("preorder");
bst.preorder();
System.out.println("postorder");
bst.postorder();
}
}
