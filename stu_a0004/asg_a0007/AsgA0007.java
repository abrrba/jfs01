class AsgA0007
{
public static void main(String args[])
{
String str=new String("HeLLO WorlD");
int count=str.length();
for(int i=0;i<count;i++)
{
char s=str.charAt(i);
if(Character.isUpperCase(s))
{
System.out.print(s);
}
}
}
}
