public class AsgA0031{
public static double calculate_gross_salary(double basic_salary,double dearness_allowance,double house_rent)
{
if(basic_salary>0){
double da=(basic_salary*dearness_allowance)/100;
double gross_salary=(basic_salary + da + house_rent);
return(gross_salary);
}
else{
return(0);
}
}

}
