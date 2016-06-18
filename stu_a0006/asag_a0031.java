class AsgA0031
{
public static double gross(double bs,double da,double hr)
{
double d=(bs*da)/100;
double salary=(bs+d+hr);
return(salary);
}
}

public class asag_a0031
{
public static void main (String[] arg)
{
AsgA0031 temp = new AsgA0031();
System.out.println(temp.gross(20000,10,5000));
}
}
