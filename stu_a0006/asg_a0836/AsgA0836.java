class AsgA0836
{
public static int GCD (int num1,int num2)
{
while(num1>0&&num2>0)
{
int x=num1%num2;

if(x>0)
{
int y=num2%x;
if(y>0)
{
int z=x%y;
if(z>0)
{
int a=y%z;
if(a>0)
{
int b=z/a;
if(b>0)
{
System.out.println("next");
break;
}
if(b==0)
{
System.out.println("GCD is"+a);
break;
}
}
if(a==0)
{
System.out.println("GCD is"+z);
break;
}
}
if(z==0)
{
System.out.println("GDC is"+y);
break;
}
}
if(y==0)
{
System.out.println("GDC is"+x);
break;
}
}
if(x==0)
{
System.out.println("GDC is"+num2);
break;
}

}
return(0);
}
}




















