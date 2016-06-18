class Asga0031
{
public double calculate_gross_salary(double basic_salary,double dearness_allowance,double house_rent)
{
if(basic_salary>0 && dearness_allowance>=0 && house_rent>0)
{
double da=(basic_salary*dearness_allowance)/100;
double gros_sal=(basic_salary+da+house_rent);
return(gros_sal);
}
else
{
return(0);
}
}
}
public class asg_a0031
{
public static void main(String[] args)
{
Asga0031 temp=new Asga0031();
System.out.println(temp.calculate_gross_salary(-20000,10,5000));
}
}
