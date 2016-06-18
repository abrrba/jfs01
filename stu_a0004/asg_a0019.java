class Asga0019
{
public double circumference(double radius)
{
    if(radius>0)
      {
        double pi=3.14;
        double rad=(2*pi*radius);
        return(rad);
      }
	else
	{
	return(0);
	} 
}
}
public class asg_a0019{
public static void main(String[] args)
{
Asga0019 temp=new Asga0019();
System.out.println(temp.circumference(-20.3));
}
}
