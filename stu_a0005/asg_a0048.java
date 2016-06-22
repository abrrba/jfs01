class Asg_a0048{
public static double calculate_longest_diagonal(double side1, double side2,double side3)
{
double x=(side1*side1);
double y=(side2*side2);
double z=(side3*side3);
double p=(x+y+z);
double q=Math.sqrt(p);
return(q);
}
}
public class asg_a0048{
public static void main(String args[])
{
Asg_a0048 obj=new Asg_a0048();
System.out.println(obj.calculate_longest_diagonal(10,4,5));
}
}

