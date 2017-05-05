import java.io.*;
class MainBST
{
	public static void main(String args[]) throws IOException
	{
		BinaryTree bst = new BinaryTree();
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String line = br.readLine();
		while(line != null){
			String array[] = line.split("-");
			bst.insert(array[0],array[1]);
			line = br.readLine();
		}
		bst.search("hru");
	}
}
