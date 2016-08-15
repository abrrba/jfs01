public class AsgA0124{
public static int my_minimum(int a,int b,int c)
{
if(a<b&&a<c)
{
return(a);
}
if(b<a&&b<c)
{
return(b);
}
if(c<a&&c<b)
{
return(c);
}
return(0);
}
}
