class AsgA0043
{
public static int number(int num)
{
int num1=0;
int count=0;
while(num>0||num<0)
{
num1=num%10;
count=count+1;
num=num/10;
}
return(count);
}
}
