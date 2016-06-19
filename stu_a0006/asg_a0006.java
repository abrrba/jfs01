class AsgA0006
{
public static double simple(double pri,double rate,double time)
{
double  amount = (pri*rate*time)/100;
return(amount);
}
}
public class asg_a0006
{
public static void main (String[] arg)
{
AsgA0006 temp = new AsgA0006();
System.out.println(temp.simple(1000,5,2));
}
} 
