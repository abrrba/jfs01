class AsgA0041
{
public static int rotet(int num)
{
//int m=1;
if((num<-10000||num>10000 ))
{ 
int x= num%10;
int x1=num/10;
int y = x1%10;
int y1=x1/10;
int z=y1%10;
int z1=y1/10;
int a=z1%10;
int a1=z1/10;
int b=a1%10;
int b1=a1/10;
 int m=(a*10000+z*1000+y*100+x*10+b);
return(m);
}
else
{
return(0);
}
}
}

