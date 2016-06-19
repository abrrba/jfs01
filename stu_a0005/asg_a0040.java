class Asg_a0040{
public static int five_digit_sum(int num)
{
int a=num%10;
int a1=num/10;
int b=a1%10;
int b1=a1/10;
int c=b1%10;
int c1=b1/10;
int d=c1%10;
int d1=c1/10;
int e=d1%10;
int e1=d1/10;
int x=(a+b+c+d+e);
if(x>0){

return(x);
}
else 
{
return(x*-1);
}

}
}
public class asg_a0040{
public static void main(String args[])
{
Asg_a0040 temp=new Asg_a0040();
System.out.println(temp.five_digit_sum(-12345));
}
}
