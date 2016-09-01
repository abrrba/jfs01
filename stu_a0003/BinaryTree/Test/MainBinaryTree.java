import java.io.*;
class MainBinaryTree{
	public static void main(String args[]){
		try{
			BinaryTree a = new BinaryTree();
			BinaryTree b = new BinaryTree();
			BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
			String line = br.readLine();
			line = br.readLine();
			while(line!=null){
				String[] str = line.split("-");
				a.insert(Integer.parseInt(str[0]),str[1]);
				b.reinsert(Integer.parseInt(str[0]),str[1]);
				line = br.readLine();
			}
			System.out.println("List in Ascending Order :");
			System.out.println("Roll No "+"   Name "  );
			a.inorder();
			System.out.println("List in Decending Order :");
			System.out.println("Roll No "+"   Name ");
			b.inorder();

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
