class AsgA0011
{
public static int sum(int num)
{
int num1=0;
int sum1=0;
if(num>0)

{
while(num>0)
{
num1=num%10;
sum1=sum1+num1;
num=num/10;

}

return(sum1);

}
if(num<0)
{
while(num<0)
{
num1=num%10;
sum1=sum1+num1;
num=num/10;
}
return(sum1*(-1));
}


return(0);

}
}
