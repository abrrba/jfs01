class asg_a0003
{
public static void main(String[] args)
{
String s1=new String("Hello World");
int a=s1.length();
for(int i=0;i<a;i++)
{
char x=s1.charAt(i);
if(Character.isUpperCase(x))
{
System.out.print(Character.toLowerCase(x));
}
else
{
char d=s1.charAt(i);
System.out.print(Character.toUpperCase(d));
}
}
}
}
