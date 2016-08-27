import java.io.*;
import java.util.Stack;
class MainBST
{
	public static void main(String args[]) throws IOException
	{
		BST bst=new BST();
		BST bst1=new BST();
		BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
		String line=br.readLine();
		while(line!=null)
		{
			String[] str=line.split("-");
			bst.insert(Integer.parseInt(str[0]),str[1]);
			bst1.rinsert(Integer.parseInt(str[0]),str[1]);
			line=br.readLine();
		}
		System.out.println(" Ascending Order Of Tree Nodes Are \n");
		bst.inorder();
		System.out.println("\n Descending Order Of Tree Nodes Are \n");
		bst1.inorder(); 
	}
}
