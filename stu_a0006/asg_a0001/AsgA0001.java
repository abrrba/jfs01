class AsgA0001
{
public static String st(String s1)
{
int x=s1.length();
String t="";
for(int i=0;i<x;i++)
{
if(i%2==0)
{
char ch=s1.charAt(i);
t=t+(Character.toUpperCase(ch));
}
else
{
char c=s1.charAt(i);
t=t+(Character.toLowerCase(c));
}
}
return(t);
}
}

