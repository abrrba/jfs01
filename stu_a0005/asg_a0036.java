class AsgA0036{
public static double convert_fahrenheit_to_celsius(double temp)
{
double x=((temp-32)*5)/9;
return(x);
}
}
public class asg_a0036{
public static void main(String args[])
{
AsgA0036 obj=new AsgA0036();
System.out.println(obj.convert_fahrenheit_to_celsius(-68));
}
}

