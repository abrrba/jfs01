class asg_a0001
{
public static void main(String[] args)
{
String s1=new String("HELLOWORLD");
int x=s1.length();
for(int i=0;i<x;i++)
{
if(i%2==0)
{
char ch=s1.charAt(i);
System.out.print(Character.toUpperCase(ch));
}
else
{
char ch=s1.charAt(i);
System.out.print(Character.toLowerCase(ch));
}
}
}
}
