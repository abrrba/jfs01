class AsgA0823
{
public static int factorial(int num)
{

int sum=num,num1;
if(num>1)
{

while(num>1)
{
num1=num-1;
sum=sum*num1;
num=num1;
}

return(sum);
}
return(1);
}
}


