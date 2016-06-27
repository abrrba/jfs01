class AsgA2209
{
public static void main(String args[])
{
String str=new String("radar");
int count=str.length();
String reverse=new String();
for(int i=count-1;i>=0;i--)
{
 reverse =reverse + str.charAt(i);
}
if(reverse.equals(str))
{
System.out.print("1");
}
else
{
System.out.print("0");
}
}
}
