class AsgA0013
{
public static void main(String args[])
{
String str=new String("HelloWorld");
int count=str.length();
for(int i=0;i<count;i++)
{
char n=str.charAt(i);

if(Character.isUpperCase(n))
{
System.out.print(Character.toLowerCase(n));
}
else
{
System.out.print(Character.toUpperCase(n));
}
}
}
}
