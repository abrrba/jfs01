class AsgA0001
{
public static char st(String s1)
{
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
char c=s1.charAt(i);
System.out.print(Character.toLowerCase(c));
}
}
return(0);
}
}

