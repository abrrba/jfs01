class Asga0012
{
public int product_of_digits(int num)
{
if(num>0)
{

int x=1;
int y=1;
while(num>1)
{
x=num%10;
y=y*x;
num=num/10;
}
 if(y<729)
   {
     return(y);
   }
 else
   {
     return(0);
   }
}
else if(num<0)
{
num=((num)*(-1));
int x=1;
int y=1;
while(num>1)
{
x=num%10;
y=y*x;
num=num/10;
}
    if(y<729)
       {
        return(y);
       }   
    else
       {
     return(0);
       }  
}
return(0);
}
}
public class asg_a0012
{
public static void main(String[] args)
{
Asga0012 temp=new Asga0012();
System.out.println(temp.product_of_digits(1023));
}
}

