class AsgA0011
{
public static int sumi (int num)

{
int num1=0;
int sum=0;
while(num>0)
{
num1=num%10;
sum=sum+num1;
num=num/10;
}
return(sum);
}
} 
 public class asg_a0011
{
public static void main(String[] arg)
{
AsgA0011 temp = new AsgA0011();
System.out.println(temp.sumi(4326));
}
}

