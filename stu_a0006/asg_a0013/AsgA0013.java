class AsgA0013
{
public static char st(String s1)
{
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
return(0);
}
}

