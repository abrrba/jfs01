import java.lang.*;
class Subclass
{
static 
{
System.out.println("this is from block of Subclass");
}
}
class block
{
public static void main(String args[])
{
Subclass obj1=new Subclass();
//Subclass obj2=new Subclass();
System.out.println("this id from main method");
}
static
{
System.out.println("This is from static block of main method");
}
} 
