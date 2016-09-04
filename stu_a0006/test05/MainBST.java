import java.io.*;
import java.util.Stack;
class MainBST
{
	public static void main(String args[]) throws IOException
	{
	try{
		BST bst=new BST();
		BST bst1=new BST();
		BufferedReader br=new BufferedReader(new FileReader("x.txt"));
		String line=br.readLine();
		while(line!=null)
		{
			String[] str=line.split("/");
			bst.insert(Integer.parseInt(str[0]),str[1]);
			bst1.dinsert(Integer.parseInt(str[0]),str[1]);
			line=br.readLine();
		}
		System.out.println(" inorder Order  ");
		bst.inorder();
		System.out.println(" Desecnding Order ");
		bst1.inorder(); 
	}
catch(NumberFormatException e)
{
System.out.println("roll number format \n");
System.out.println("the wrong nu you entered is\n " + "\n"+ e);

}
}
}

