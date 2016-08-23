import java.io.*;
class MainLinkedList
{
public static void main(String[] args) throws IOException
{
BufferedReader br=new BufferedReader(new FileReader("tvs.txt"));
BufferedReader br1=new BufferedReader(new FileReader("tvs1.txt"));
String Line=br.readLine();
String Line1=br1.readLine();
LinkedList x=new LinkedList();
while(br.readLine() !=null &&br1.readLine()!=null)
{
String st=Line;
String[] str=st.split("-");
String st1=Line1;
String[] str1=st1.split("-");
x.addAtTail(Integer.parseInt(str[0]),str[1],str[2],Integer.parseInt(str[3]),str[4],Integer.parseInt(str1[1]),Integer.parseInt(str1[2]),Integer.parseInt(str1[3]));
Line=br.readLine();
Line1=br1.readLine();
}
x.printAll();
br.close();
}
}
