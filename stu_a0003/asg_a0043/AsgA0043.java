public class AsgA0043{
public static int numlen(int num)
{
int len=0;
while(num>0)
{
num=num/10;
len=len+1;
}
return(len);
}
}
