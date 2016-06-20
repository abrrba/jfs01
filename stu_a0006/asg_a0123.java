class AsgA0123
{
public static int max(int a,int b,int c,int d)
{
int maxi= (a>b&&a>c&&a>d?a:b>c&&b>d?b:c>d?c:d);
return(maxi);
}
}

public class asg_a0123
{
public static void main(String[] arg)
{
AsgA0123 temp = new AsgA0123();
System.out.println(temp.max(23,77,35,2));
}
}

