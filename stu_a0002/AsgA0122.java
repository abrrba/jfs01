class AsgA0122
{
public double  is_profit(double selling_price,double cost_price)
{
double x=((selling_price-cost_price)/cost_price);
if(x>0)
{
return(x);
}
else
{
return(0);
}
}
}
class asg_a0122
{
public static void main(String args[])
{
AsgA0122 temp=new AsgA0122();
System.out.println(temp.is_profit(200,100));
}
}
