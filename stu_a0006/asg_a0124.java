class AsgA0124
{
public static int min(int a,int b,int c)
{
int mini=(a<b&&a<c?a:b<c?b:c);
return(mini);
}
}

public class asg_a0124
{
public static void main(String[] arg)
{
AsgA0124 temp = new AsgA0124();
System.out.println(temp.min(32,45,8));
}
}
