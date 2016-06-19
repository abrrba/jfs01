class AsgA0010
{
public static int re(int num)
{
if(99<num&&num<999)
{
int x=num%10;
int x1=num/10;
int y=x1%10;
int y1=x1/10;
int z=y1%10;
int z1=y1/10;
int sum=(x*100+y*10+z*1);
return(sum);
}
if(-999<num&&num<-99)
{
int x=num%10;
int x1=num/10;
int y=x1%10;
int y1=x1/10;
int z=y1%10;
int z1=y1/10;
int sum=(x*100+y*10+z*1);
return(sum);
}

else 
{
return(0);
}
}
}

public class asg_a0010
{
public static void main(String[] arg)
{
AsgA0010 temp = new AsgA0010();
System.out.println(temp.re(-13));
}
}
 

