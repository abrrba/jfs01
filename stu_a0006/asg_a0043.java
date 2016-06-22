class AsgA0043
{
public static int number(int num)
{
int num1=0;
int count=0;
while(num>0)
{
num1=num%10;
count=count+1;
num=num/10;
}
return(count);
}
}
public class asg_a0043
{
public static void main(String[] arg)
{
AsgA0043 temp = new AsgA0043();
System.out.println(temp.number(2345));
}
}
