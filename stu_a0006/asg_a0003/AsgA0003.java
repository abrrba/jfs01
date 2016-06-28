class AsgA0003
{
public static char st(String s1)
{
int a=s1.length();
char ser=s1.charAt(0);
System.out.print(Character.toLowerCase(ser));
for(int i=1;i<a;i++)
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
return(0);
}
}
