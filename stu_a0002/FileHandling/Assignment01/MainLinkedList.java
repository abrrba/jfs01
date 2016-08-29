import java.io.*;
class MainLinkedList
{
public static void main(String[] args) throws IOException
{
BufferedReader br=new BufferedReader(new FileReader("mrf.txt"));
LinkedList x=new LinkedList();
String Line=br.readLine();
String str[]=new String[10];
int i=0;
while(Line !=null)
{
str[i]=Line;
int y = Integer.parseInt(str[i]);
x.addAtTail(y);
Line=br.readLine();
i++;
}
x.printAll();
br.close();
}
}
