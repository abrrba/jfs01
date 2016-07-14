class AsgA0043
{
public static int numlen(int num)
{
int count=0;
if(num>0)
{
while(num>=1)
{
num=num/10;
count=count+1;
}
}
else
{
num=num*(-1);
while(num>=1)
{
num=num/10;
count=count+1;
}
}
return(count);
}
}

