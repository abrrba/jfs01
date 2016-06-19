class Asg_a0124{
public static int my_minimum(int x, int y, int z)
{
if(x<y && x<z)
{
return(x);
}
else if(y<x && y<z)

{
return(y);
}
else
{
return(z);
}
}
}
public class asg_a0124{
public static void main(String args[])
{
Asg_a0124 temp=new Asg_a0124();
System.out.println(Asg_a0124.my_minimum(12,4,423));
}
}

