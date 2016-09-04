import java.io.*;
class MainBST
{
public static void main(String args[]) throws IOException
{
BST bst=new BST();
PrintWriter pw=new PrintWriter("FinalOutput.txt");
BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
String line=br.readLine();
while(line!=null)
{
String[] str=line.split(":");
String[] nstr=str[1].split(",");
int len=nstr.length;
for(int i=0;i<len;i++)
{
bst.insert(Integer.parseInt(nstr[i]));
}
line=br.readLine();
}
bst.postorder();
bst.lca(11,17);
//----------------------
BufferedReader br1=new BufferedReader(new FileReader("output1.txt"));
String Line=br1.readLine();
while(Line!=null)
{
pw.println(Line);
Line=br1.readLine();
}
BufferedReader br2=new BufferedReader(new FileReader("output2.txt"));
Line=br2.readLine();
while(Line!=null)
{
pw.println(Line);
Line=br2.readLine();
}
br1.close();
br2.close();
pw.close();
}
}
