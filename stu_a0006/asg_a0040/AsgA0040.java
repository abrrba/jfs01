class AsgA0040
{
public static int sum(int num)
{

if(num>0)
{
int x=num%10;
int x1=num/10;
int y=x1%10;
int y1=x1/10;
int z=y1%10;
int z1=y1/10;
int a=z1%10;
int a1=z1/10;
int b=a1%10;
int b1=a1/10;
int sum=(x+y+z+a+b);
return(sum);
}
else if(num<0)
{
int x=num%10;
int x1=num/10;
int y=x1%10;
int y1=x1/10;
int z=y1%10;
int z1=y1/10;
int a=z1%10;
int a1=z1/10;
int b=a1%10;
int b1=a1/10;
int sum=(x+y+z+a+b);
return(sum*-1);
}
else
{
return(0);
}
}
}
