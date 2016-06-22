class AsgA0127
{
public static double floor(double num)
{
if(num>0)
{
int num1=(int)num;
int x=num1;
return(x);
}
else if(num<0)
{
int num1=(int)num;

int y=num1-1;
return(y);
}
else
{
return(0);
}
}
}

public class asg_a0127
{
public static void main(String[] arg)
{
AsgA0127 temp = new AsgA0127();
System.out.println(temp.floor(-3.4));
}
}
