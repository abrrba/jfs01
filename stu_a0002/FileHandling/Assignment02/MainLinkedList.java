import java.io.*;
class MainLinkedList
{
public static void main(String[] args) throws IOException
{
BufferedReader br=new BufferedReader(new FileReader("tvs.txt"));
String Line=br.readLine();
LinkedList x=new LinkedList();
while(br.readLine() !=null)
{
String trb=Line;
String[] str=trb.split("-");
x.addAtTail(Integer.parseInt(str[0]),str[1],str[2],Integer.parseInt(str[3]),str[4]);
Line=br.readLine();
}
x.printAll();
br.close();
}
}
