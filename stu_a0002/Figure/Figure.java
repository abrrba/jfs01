import java.io.*;
class Figure{

int id;
String color;
String name;

public void draw(){
System.out.println("Drawing Figure ");
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


}

class Rectangle extends Figure{
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

class Circle extends Figure{
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


