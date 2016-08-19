import java.io.*;
class fig{

int id;
String color;
String name;

public void draw(){
System.out.println("The Figure is drawn");
}

public void setId(int i){
id=i;
}

public int getId(){
return id;
}

public void setColor(String c){
color=c;
}

public String getColor(){
return color;
}

public void setName(String n){
name=n;
}

public String getName()
{
return name;
}

//public double CalculateArea();
}

class Rectangle extends fig{
String n="rectangle";
int i=1;
String c="blue";
double length;
double width;

public double CalculateRectArea(double l,double w)
{
double result=l*w;
return result;
}

}

class Circle extends fig{
String n="circle";
int i=2;
String c="red";
double radius;
public double CalculateCircleArea(double r)
{
double result=2*3.14*r;
return result;
}
}


class canvas
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
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
