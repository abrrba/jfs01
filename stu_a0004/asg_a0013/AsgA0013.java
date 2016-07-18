class AsgA0013
{
public static String toggle_case(String str)
{
String t="";
int count=str.length();
for(int i=0;i<count;i++)
{
char n=str.charAt(i);

if(Character.isUpperCase(n))
{
t=t+Character.toLowerCase(n);
}
else
{
t=t+Character.toUpperCase(n);
}
}
return(t);
}
}
