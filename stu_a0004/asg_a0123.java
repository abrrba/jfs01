class Asga0123
{
public int my_maximum(int num1,int num2,int num3)
{
if(num1>num2 &&num1>num3)
{
return(num1);
}
else if(num2>num1 && num2>num3)
{
return(num2);
}
else
{
return(num3);
}
}
}
class asg_a0123
{
public static void main(String args[])
{
Asga0123 temp=new Asga0123();
System.out.println(temp.my_maximum(10,5,20));
}
}
