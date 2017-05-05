import java.io.*;
class MainBST{
	public static void main(String args[]){					
		BST a = new BST();
		a.insert(10);
		a.insert(23);
		a.insert(6);
		a.insert(12);
		a.insert(11);
		a.insert(77);
		a.insert(36);
		a.insert(86);
		a.printAll();
		System.out.println();
		System.out.print("Tree Leaf Nodes : ");
		a.printDLL();
		System.out.println();
		System.out.print("Link List : ");
		a.linkedListData();
	}
}
