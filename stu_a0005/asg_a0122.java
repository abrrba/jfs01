class Asg_a0122{
public static double is_profit(double sp, double cp){
if(sp>cp)
{
return(1);
}
else if(sp==cp)
{
return(0);
}
else
{
return(-1);
}
}
}
public class asg_a0122{
public static void main(String args[])
{
Asg_a0122 temp=new Asg_a0122();
System.out.println(temp.is_profit(3,4));
}
}
