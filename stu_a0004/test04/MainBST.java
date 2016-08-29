import java.io.*;
import java.util.Stack;
class MainBST
{
	public static void main(String args[]) throws IOException
	{
	try{
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
		System.out.println(" Ascending Order Of Tree Nodes Are ");
		bst.inorder();
		System.out.println(" Desecnding Order Of Tree Nodes Are ");
		bst1.inorder(); 
	}
catch(NumberFormatException e)
{
System.out.println("roll number format wrong please enter the valid inputs\n");
System.out.println("the wrong number you entered is\n " + "\n"+ e);
//e.printStackTrace();
}
}
}
