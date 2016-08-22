import java.io.*;
class MainFigure
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new FileReader("avi.txt"));
String line = br.readLine();
while(line!=null)
{
String[] str=line.split("\\s");
if(str[0]=="R")
{
Rectangle rec=new Rectangle();
System.out.println(rec.CalculateRectArea(Integer.parseInt(str[1]),Integer.parseInt(str[2])));
line=br.readLine();
}
else if(str[0]=="c");
{
Circle cir=new Circle();
System.out.println(cir.CalculateCircleArea(Integer.parseInt(str[1])));
line=br.readLine();
}
}
}
}
