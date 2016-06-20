class AsgA0012
{
public static int sum(int num)
{
int num1=0;
int sum1=0;
if(99<num&&num<999)
{
num1=num%10;
sum1=sum1+num1;
num=num1/10;
return(sum1);
}
else if(-99>num&&num>-999)
{
num1=num%10;
sum1=sum1+num1;
num=num/10;
return(sum1);
}
else
{
return(0);
}
}
}

public class asg_a0012
{
public static void main(String[] arg)
{
AsgA0012 temp = new AsgA0012();
System.out.println(temp.sum(1203));
}
}
