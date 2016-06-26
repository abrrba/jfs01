class AsgA0004
{
public static void main(String args[])
{
String str=new String("HELLO");
int count=str.length();
for(int i=1;i<count;i++)
{
char s=str.charAt(i);
if(Character.isLowerCase(s))
{
System.out.print(s);
}
}
}
}
