class Asg_a0123{
public static int my_maximum(int x, int y, int z)
{
if(x >y && x>z)
{
return(x);
}
else if(y>x && y>z)
{
return(y);
}
else
{
return(z);
}
}
}
public class asg_a0123{
public static void main(String args[])
{
Asg_a0123 temp=new Asg_a0123();
System.out.println(temp.my_maximum(12,34,23));
}
}

