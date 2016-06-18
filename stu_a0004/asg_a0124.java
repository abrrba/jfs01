class Asga0124
{
public int my_minimum(int num1,int num2,int num3)
{
if(num1<num2 &&num1<num3)
{
return(num1);
}
else if(num2<num1 && num2<num3)
{
return(num2);
}
else
{
return(num3);
}
}
}
class asg_a0124
{
public static void main(String args[])
{
Asga0124 temp=new Asga0124();
System.out.println(temp.my_minimum(10,5,20));
}
}
