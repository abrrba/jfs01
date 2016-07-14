class AsgA0031
{
public static double gross(double bs,double da,double hr)
{
if(bs>0)
{
double d=(bs*da)/100;
double salary=(bs+d+hr);
return(salary);
}
else
{
return(0);
}
}
}
