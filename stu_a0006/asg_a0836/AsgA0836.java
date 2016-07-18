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
return(999999);

}
if(b==0)
{
return(+a);

}
}
if(a==0)
{
return(+z);

}
}
if(z==0)
{
return(+y);

}
}
if(y==0)
{
return(+x);

}
}
if(x==0)
{
return(+num2);

}

}
return(0);
}
}




















