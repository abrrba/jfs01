public class asg_a000class AsgA0001
{
public static void main(String args[])
{
String str=new String("HelloWorld");
int lim=str.length();
for(int i=0;i<lim;i++)
{
if(i%2==0)
{
char s=str.charAt(i);
System.out.print(Character.toUpperCase(s));
}
else
{
char t=str.charAt(i);
System.out.print(Character.toLowerCase(t));
}
}
}
} 

  
