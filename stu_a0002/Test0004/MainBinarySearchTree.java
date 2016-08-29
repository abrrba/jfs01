
import java.io.*;
import java.util.Scanner;
import java.util.Stack;
class MainBinarySearchTree
{
	private static BufferedReader input;

	public static void main(String args[]) throws IOException
	{
	try{
		BinarySearchTree bs=new BinarySearchTree();
		BinarySearchTree bst=new BinarySearchTree();
		input = new BufferedReader(new FileReader("emp.txt"));
		String read=input.readLine();
		while((read=input.readLine())!=null)
		{  
			String[] str=read.split("--");
			bs.insert(Integer.parseInt(str[0]),str[1]);
			bst.insertt(Integer.parseInt(str[0]),str[1]);
			
		}
		System.out.println(" Ascending Order is");
		System.out.println("EmpId "+"   \tName " );
		bs.inorder();
		System.out.println(" Desecnding Order is");
		System.out.println("EmpId "+"   \tName " );
		bst.inorder(); 
	}
	catch(IOException e){
            System.out.println("There was a problem:" + e);
        }
     catch(NumberFormatException ex){
			System.err.println("Ilegal input");

}
}}