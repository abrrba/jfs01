import java.io.*;
import java.util.Stack;
class MainBST{
	public static void main(String args[]) throws Exception{
		BST b = new BST();
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String thisLine = br.readLine();
		while( thisLine != null){
		String[] str = thisLine.split(":");
		b.InsertElement(Integer.parseInt( str[0]),str[1] );
		thisLine = br.readLine();
		}
		System.out.println("inorder ");
		b.Inorder();
		System.out.println("\npreorder ");
		b.Preorder();
		System.out.println("\npostorder ");
		b.Postorder();


	}
}
