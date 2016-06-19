class Asg_a0012{
public static int prod_of_digit(int num)
{
int mul1=1;
int mul=1;
int num1=1;
while(num>=1 || num<=-1)
{
num1=num%10;
mul=mul*num1;
num=num/10;
}
if(mul<=1)
{
mul1=mul*-1;
return(mul1);
}
else
{
return(mul);

}
}
}
public class asg_a0012{
public static void main(String args[])
{
Asg_a0012 obj=new Asg_a0012();
System.out.println(obj.prod_of_digit(-21));
}
}

