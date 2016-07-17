class AsgA0853
{
public static int leap(int year)
{

while(year>1000&&year<=9999)
{
int x= year%100;
int y=x%4;
if(y==0)
{
return (1);
}
else
{
return(0);
}
}
return(0);
}
}
