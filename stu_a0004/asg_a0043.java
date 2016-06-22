class Asga0043
{
public static int numlen(int num)
{
int count=0;

while(num>=1)
{
num=num/10;
count=count+1;
}
return(count);
}
}
public class asg_a0043
{
public static void main(String args[])
{
Asga0043 temp=new Asga0043();
System.out.println(temp.numlen(12345));
}
}
