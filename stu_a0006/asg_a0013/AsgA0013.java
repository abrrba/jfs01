class AsgA0013
{
public static String st(String s1)
{
int a=s1.length();
String t="";

for(int i=0;i<a;i++)
{
char x=s1.charAt(i);
if(Character.isUpperCase(x))
{
t=t+(Character.toLowerCase(x));
}
else
{
char d=s1.charAt(i);
t=t+(Character.toUpperCase(d));
}
}
return(t);
}
}

