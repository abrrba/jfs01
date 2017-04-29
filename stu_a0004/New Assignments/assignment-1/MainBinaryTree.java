mport java.io.*;
class MainBinaryTree{
	public static void main(String args[]){					
		BinaryTree a = new BinaryTree();
		a.insert(5);
		a.insert(3);
		a.insert(4);
		a.insert(2);
		a.insert(1);
		a.insert(7);
		a.insert(6);
		a.insert(8);
		a.printAll();
		System.out.println();
		System.out.print("Tree Leaf Nodes : ");
		a.printDLL();
		System.out.println();
		System.out.print("Linkde List : ");
		a.linkedListData();
	}
}
