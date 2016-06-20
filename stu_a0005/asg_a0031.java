class Asg_a0031{
public static double calculate_gross_salary(double bs, double da, double hr)
{
double d=(bs*da)/100;
double x=(d+bs+hr);
if (bs<0){
return(0);
}
else
{
return(x);
}
}
}
public class asg_a0031{
public static void main(String args[])
{
Asg_a0031 obj=new Asg_a0031();
System.out.println(Asg_a0031.calculate_gross_salary(-20000,10,5000));
}
}

