class AsgA122
{
public static int profit(int sp,int cp)
{
int sale=(sp-cp);
int x=1;
int  y=-1;
int z=0;

if(sale>0)
{
System.out.println("profit is" +x);
return(x);
}
else
if(sale<0)
{
System.out.println("profit is" +y);
return(y);
}

else
System.out.println("profit is" +z);
return(z);
}
}

public class asg_a0122
{
public static void main (String[] arg)
{
AsgA122 temp = new AsgA122();
System.out.println(temp.profit(100,200));
}
}

