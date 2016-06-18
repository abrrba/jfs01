class AsgA0006{
public double get_amount(double principle,double rate,double time)
{
double simple_interest=0.0;
simple_interest=(principle*rate*time)/100;
return simple_interest;
}
}
public class asg_a0006
{
public static void main(String[] args)
{
AsgA0006 temp=new AsgA0006();
System.out.println(temp.get_amount(1200.50,5,1));
}
}
