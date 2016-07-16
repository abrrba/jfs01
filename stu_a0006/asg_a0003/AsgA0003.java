class AsgA0003
{
public static String st(String s1)
{
int a=s1.length();
String t="";
char ser=s1.charAt(0);
t=t+(Character.toLowerCase(ser));
for(int i=1;i<a;i++)
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
