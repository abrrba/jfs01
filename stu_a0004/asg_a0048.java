class Asga0048
{
public double calculate_longest_diagonal(double side1,double side2,double side3)
{
double d1=((side1*side1)+(side2*side2)+(side3*side3));
double d=Math.sqrt(d1);
return(d);
}
}
class asg_a0048
{
public static void main(String args[])
{
Asga0048 temp=new Asga0048();
System.out.println(temp.calculate_longest_diagonal(10,4,5));
}
}
